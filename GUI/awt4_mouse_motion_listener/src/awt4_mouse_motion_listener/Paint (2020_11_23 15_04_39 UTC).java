package awt4_mouse_motion_listener;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Paint extends Frame implements MouseMotionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	Label l;
	Color c=Color.BLUE;
	
	Paint(){
	l=new Label();
	l.setBounds(20, 40, 100, 20);
	add(l);
	
	addMouseMotionListener(this);
	
	setSize(400, 400);
	setLayout(null);
	setVisible(true);
	
	addWindowListener(new WindowListener() {
		
		@Override
		public void windowOpened(WindowEvent arg0) {
			dispose();
		}
		
		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});
	
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		l.setText("X="+e.getX()+", Y"+e.getY());
		Graphics g=getGraphics();
		g.setColor(Color.RED);
		g.fillOval(e.getX(), e.getY(), 20, 20);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	
		l.setText("X="+e.getX()+", Y"+e.getY());
	}
	
	
	public static void main(String[] args) {
	
	new Paint();	
	}
}
