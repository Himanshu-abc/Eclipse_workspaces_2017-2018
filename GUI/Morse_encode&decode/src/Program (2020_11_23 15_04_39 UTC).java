/*This is a simple morse code translator;

INSTRUCTIONS:Input your message. The program will automatically translate English to Morse Code, and vice versa. It is recommended to read the notes below.
   
   •Accepts periods/stops (.), quotation marks ("), commas (,), question marks (?), parentheses (), apostrophes ('), exclamation marks (!), and slashes(/). 
   •Please do not input asterisks (*) unless it is a Morse Code character, as they will cause the program to attempt to translate the message to English from Morse Code.
   •IMPORTANT: When inputting a Morse Code message, please add a space between each character, and two spaces between words to ensure proper translation and word spacing.
*/

import java.util.Scanner;

public class Program
{

/*changeLog{
    v.1.0: Program written and published
    v.1.1: Minor edit to class name
    v.2.0: Fixed major problem with Morse Code to English translation.
    v.2.1: Improved efficiency; decreased program length.
    v.2.2: Minor edit to class name
}*/


    public static String ToEng(String message){
        
        String[] mCodes={/*Stop*/ "*-*-*- ", /*quotation marks*/ "*-**-* ", /*comma*/ "--**-- ", /*question mark*/ "**--** ", /*parentheses*/"-*--*- ", "-*--*-", /*apostrophe*/ "*----* ", /*exclamation mark*/ "-*-*-- ", /*slash*/ "-**-* ", /*numbers*/ "*---- ", "**--- ", "***-- ", "****- ", "***** ", "-**** ", "--*** ", "---** ", "----* ", "----- ", /*Letters*/ "--** ", "-*-- ", "-**- ", "*--- ", "*--* ", "***- ", "*-- ", "**-* ", "**- ", "-*-* ", "-*** ", "**** ", "*-** ", "*** ", "*-* ", "-** ", "--*- ", "-*- ", "--* ", "*- ", "-* ", "--- ", "** ", "-- ", "- ", "* "};
        
        String[] chars={".", "\"", ",", "?", "(", ")", "'", "!", "/", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "z", "y", "x", "j", "p", "v", "w", "f", "u", "c", "b", "h", "l", "s", "r", "d", "q", "k", "g", "a", "n", "o", "i", "m", "t", "e"};
    
    
    for(int a=0; a<=44; a++){
    message=message.replace(mCodes[a], chars[a]);
        }
 
   
   System.out.println(message);
   return(message);
        
    }

    public static String ToMorse(String Message){
        
        String[] mcodes={"*- ", "-*** ", "-*-* ", "-** ", "* ", "**-* ", "--* ", "**** ", "** ", "*--- ", "-*- ", "*-** ", "-- ", "-* ", "--- ", "*--* ", "--*- ", "*-* ", "*** ", "- ", "**- ", "***- ", "*-- ", "-**- ", "-*-- ", "--** ", /*numbers*/ "*---- ", "**--- ", "***-- ", "****- ", "***** ", "-**** ", "--*** ", "---** ", "----* ", "----- ", /*Stop*/ "*-*-*- ", /*quotation marks*/ "*-**-* ", /*comma*/ "--**-- ", /*question mark*/ "**--** ", /*parentheses*/"-*--*- ", "-*--*-", /*apostrophe*/ "*----* ", /*exclamation mark*/ "-*-*-- ", /*slash*/ "-**-* "};
    
        String[] Chars={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "\"", ",", "?", "(", ")", "'", "!", "/"};
    
        String[] caps={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    
    
    for (int b=0; b<=44; b++){
        Message=Message.replace(Chars[b], mcodes[b]);
     }
   
   
    for (int c=0; c<=25; c++){
        Message=Message.replace(caps[c], mcodes[c]);
        
    }
   
   
   
   System.out.println(Message);
   return(Message);
        
    }


    public static void main(String[] args) {
      
      System.out.println("Please input your message:");
      String msg;
      Scanner sc=new Scanner(System.in);
    msg=sc.nextLine();
    System.out.println(msg+"\n");
    
    if (msg.contains("*")){
        ToEng(msg);
    }
    
    else{
        ToMorse(msg); 
    }
    
    }
}