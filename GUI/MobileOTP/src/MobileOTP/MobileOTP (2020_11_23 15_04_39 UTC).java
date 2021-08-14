/*
 *
 * Mobile One Time Passwords (Mobile-OTP) for Java 2 Micro Edition, J2ME
 * written by Matthias Straub, Heilbronn, Germany, 2003 to 2010
 * (c) 2003, 2010 by Matthias Straub
 *
 * Version 1.07
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * This program uses the MD5 library for java by Santeri Paavolainen
 * that was also released under the terms of the GPL
 *
 * CHANGELOG
 * Version 1.04:
 *  - first public release
 * New in version 1.05:
 *  - added the ability to set an offset from UTC for devices that are unaware of timezones
 *  - is compatible with otpverify.sh v.1.04
 * New in version 1.06:
 *  - display optimization for newer phones with bigger displays
 * New in version 1.061:
 *  - only numeric keys as well as * and # can be used. This adds compatibility to smartphones like the Nokia N97
 * New in version 1.07: 
 *  - TextField-input for compatibility with modern touchscreen and QWERTY smartphones (down to the simpliest J2ME capable phones like the Nokia 6210)
 *
 * usage: 
 * - 0000 to initialize token
 * - any other four digit PIN to generate a one-time-password 
 *
 */

package MobileOTP;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.util.Date;
import javax.microedition.rms.*;
import MobileOTP.MD5;
import java.util.Calendar;


public class MobileOTP extends MIDlet implements CommandListener
{
    private Command exitCommand = new Command("Exit", Command.SCREEN, 1);
    private Command aboutCommand = new Command("About", Command.SCREEN, 2);
	private Command infoCommand = new Command("Info", Command.SCREEN, 2);
	private Command timezoneCommand = new Command ("Time Zone", Command.SCREEN, 2);
    private Command backCommand = new Command("Back", Command.BACK, 1);
    private Command cancelCommand = new Command("Cancel", Command.BACK, 1);
    private Command tzsaveCommand = new Command("Save", Command.BACK, 2);
	
	private static String PIN="";
	private static String secret="";
	private static String initdate="";
	private static int timez=12;
	private static RecordStore rs;


	String otp="";
    String seed="";
    MD5 hash;
	Date now=new Date();
	Calendar cnow;
	String epoch;
	Form form;	
	TextField pinfield;
	Display display;
	
    public MobileOTP()
    {
    }
        
    public void startApp()
    {
	display=Display.getDisplay(this);
    try 
	{
    	rs = RecordStore.openRecordStore( "motp", true);
    	if ( rs.getNumRecords() !=3 ) 
       		{
       			rs.closeRecordStore();
       			RecordStore.deleteRecordStore( "motp" );
       			rs = RecordStore.openRecordStore ("motp",true);
       			rs.addRecord("0000000000000000".getBytes(),0,8);
       			rs.addRecord("Not initialized!".getBytes(),0,16);
       			rs.addRecord("12".getBytes(),0,2);
       		}    			
    } 
    catch(RecordStoreException rse) {System.out.println("RS Error! Open");}
    try
    {
    	secret=new String(rs.getRecord(1));
    	initdate=new String(rs.getRecord(2));
    	timez=Integer.parseInt(new String(rs.getRecord(3)));
    }
    catch(RecordStoreException rse) {System.out.println("RS Error! Read");}
 
    form = new Form("Mobile-OTP");
	pinfield=new TextField("Enter PIN: ","",4,TextField.PASSWORD|TextField.NUMERIC);
	form.append(pinfield);
	
	ItemStateListener listener = new ItemStateListener() 
	{
        public void itemStateChanged(Item item) 
		{
	    	PIN=pinfield.getString();
			if (PIN.equals("0000") || pinfield.getLabel().equals("25 random keys: "))
        	{
				if (pinfield.getString().equals("0000"))
				{
					deleteallbut(1);
					pinfield.setLabel("25 random keys: ");
					pinfield.setMaxSize(25);
					pinfield.setString("");
				}
				else if (pinfield.getString().length()==25)
				{
				secret=new MD5(pinfield.getString()).asHex().substring(0,16);
        		cnow=Calendar.getInstance();
        		String day=""+cnow.get(Calendar.DAY_OF_MONTH);
        		String month=""+(cnow.get(Calendar.MONTH)+1);
        		String hour=""+cnow.get(Calendar.HOUR);
        		String minute=""+cnow.get(Calendar.MINUTE);
        		String year=""+(cnow.get(Calendar.YEAR)-2000);
        		if (day.length()<2) day="0"+day;
        		if (month.length()<2) month="0"+month;
        		if (hour.length()<2) hour="0"+hour;
        		if (minute.length()<2) minute="0"+minute;
        		if (year.length()<2) year="0"+year;
        		initdate=day+"/"+month+"/"+year+","+hour+":"+minute;
        		try
        			{
        				rs.setRecord(1,secret.getBytes(),0,secret.length());
        				rs.setRecord(2,initdate.getBytes(),0,initdate.length());
        			}
        		catch (RecordStoreException rse) {System.out.println("RS Error! Write");}
        		form.append("Init-Secret=\n");
        		form.append(secret.substring(0,8)+"\n");
        		form.append(secret.substring(8,16)+"\n");
				pinfield.setLabel("Enter PIN: ");
				pinfield.setMaxSize(4);
				pinfield.setString("");
				}
				
			}
			else if (PIN.length()==4)
			{
        			now=new Date();
        			epoch=""+(now.getTime()+((timez-12)*3600000));
        			epoch=epoch.substring(0,epoch.length()-4);
        			otp=epoch+secret+PIN;
        			hash=new MD5(otp);
        			otp=hash.asHex().substring(0,6);
					deleteallbut(1);
					if (secret.equals("00000000"))
					{
						form.append("Not initialized!\nEnter 0000\n");
					}
					else
					{	
						form.append("Pass: " + otp +"\n");
					}
					pinfield.setString("");
			}
        }
    };
    form.setItemStateListener(listener); 
    form.addCommand(exitCommand);
    form.addCommand(aboutCommand);
	form.addCommand(infoCommand);
	form.addCommand(timezoneCommand);
    form.setCommandListener(this);
	display.setCurrent(form);
    }
     	
	public void deleteallbut(int leave)
	{
	    for (int i=form.size(); i> leave; i--)
		  {
          form.delete(i-1);
          }
	}
    public void pauseApp()
    {
    }
        
    public void destroyApp(boolean unconditional)
    {
    }
        
    public void commandAction(Command c, Displayable s)
    {
            if ( c == exitCommand )
            {
				try
              	{
           		rs.closeRecordStore();
              	}
                catch(RecordStoreException rse) {}
                destroyApp(false);
                notifyDestroyed();
                }
                if ( c == aboutCommand )
                {
                	Canvas about = new Canvas()
                	{
                		public void paint(Graphics g)
                		{
                			int w=getWidth();
        				int h=getHeight();
        				g.setColor(255,255,255);
        				g.fillRect(0,0,w,h);
        				g.setColor(0,0,0);
        				g.drawString("Mobile-OTP",3,3,0);
                			g.drawString("v. 1.07",3,3+h/5,0);
                			g.drawString("(c) 2003, 2010",3,3+2*h/5,0);
                			g.drawString("M. Straub",3,3+3*h/5,0);
                		}
                	};
                	about.addCommand(backCommand);
                	about.setCommandListener(this);
                	Display.getDisplay(this).setCurrent(about);
                }
		if ( c == infoCommand )
                {
			now=new Date();
        		epoch=""+(now.getTime()+((timez-12)*3600000));
        		epoch=epoch.substring(0,epoch.length()-4);
        		Canvas infoc = new Canvas()
                	{
                		public void paint(Graphics g)
                		{
                		int w=getWidth();
        				int h=getHeight();
        				g.setColor(255,255,255);
        				g.fillRect(0,0,w,h);
        				g.setColor(0,0,0);
        				g.drawString("Epoch-Time:",1,1,0);
        				g.drawString(epoch,1,1+h/5,0);
        				g.drawString("Initialization:",1,1+2*h/5,0);
        				g.drawString(initdate,1,1+3*h/5,0);
                		}
                	};
                	infoc.addCommand(backCommand);
                	infoc.setCommandListener(this);
                	Display.getDisplay(this).setCurrent(infoc);
                }
                if ( c == backCommand | c == cancelCommand )
                {
                	startApp ();
                }
                if ( c == tzsaveCommand )
                {
                	try
        		{
        			rs.setRecord(3,(""+timez).getBytes(),0,(""+timez).length());
        		}
        		catch (RecordStoreException rse) {System.out.println("RS Error! Write");}
                	startApp ();
                }
                
                if ( c == timezoneCommand )
                {
                	
        		Canvas timezc = new Canvas()
                	{
                		public void paint(Graphics g)
                		{
                			now=new Date();
        				epoch=""+(now.getTime()+((timez-12)*3600000));
        				epoch=epoch.substring(0,epoch.length()-4);
                			int w=getWidth();
        				int h=getHeight();
        				g.setColor(255,255,255);
        				g.fillRect(0,0,w,h);
        				g.setColor(0,0,0);
        				g.drawString("Set Time Zone=",1,1,0);
        				if (timez > 12) g.drawString("UTC"+(12-timez),1,1+h/5,0);
        				else g.drawString("UTC+"+(12-timez),1,1+h/5,0);
        				g.drawString("Epoch-Time:",1,1+2*h/5,0);
        				g.drawString(epoch,1,1+3*h/5,0);
                		}
                		protected void keyPressed (int keyCode)
                		{
                			if (keyCode == KEY_NUM1 | keyCode == KEY_NUM4 | keyCode == KEY_NUM7 | keyCode == KEY_STAR | keyCode == LEFT)
                			{
                				timez++;
                			}
                			if (keyCode == KEY_NUM3 | keyCode == KEY_NUM6 | keyCode == KEY_NUM9 | keyCode == KEY_POUND | keyCode == RIGHT)
                			{
                				timez--;
                			}
                			if (timez < 0 ) timez=0;
                			if (timez > 24 ) timez=24;
                			repaint();
                		}
                		
                	};
                	
                	timezc.addCommand(cancelCommand);
			timezc.addCommand(tzsaveCommand);
                	timezc.setCommandListener(this);
                	Display.getDisplay(this).setCurrent(timezc);
                }
        }
}