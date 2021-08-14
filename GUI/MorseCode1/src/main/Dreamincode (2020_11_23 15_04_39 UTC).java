package main;

import java.util.Scanner;

 

public class Dreamincode

{

    

        final String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i",

          "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",

          "v", "w", "x", "y", "z", " "};

 

        final String[] morse = {".-", "-...", "-.-/>.", "-..", ".", "..-.", "--.", "....", "..",

          ".---", "-.-/>", ".-..", "--", "-.", "---", ".--.", "--.-/>",  ".-.", "...", "-", "..-",

          "...-" ,".--" ,"-..-", "-.-/>-", "--..", "|"};

    public static void main(String [] args)

    {      

        Scanner input = new Scanner( System.in );

        System.out.print( "Would you like to convert English to Morse (y or n)? " );

        String answer = input.nextLine();

        if( answer.equals( "y" ) )

        {

            Scanner scan = new Scanner(System.in);

            System.out.print("Please enter a String for translation to Morse:");

            String letter = scan.nextLine();

            System.out.println( toMorse( letter ));

      }

        if (answer.equalsIgnoreCase( "n" ) )

        {

            System.out.print( "Morse to English? " );

            String answer2 = input.nextLine();

                if (answer2.equalsIgnoreCase( "yes" ) )

                {

                    Scanner scan = new Scanner(System.in);

                    System.out.print("Please enter a String for translation to English:");

                   String dot = scan.nextLine();

                    

                    for (int j=0; j < 26; ++j)

                    {

                        System.out.println( toAlpha( dot ));

                    }

 

                }

        }

    }

 

    public static String toMorse(String letter)

    {

        final String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i",

        "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",

        "v", "w", "x", "y", "z", " "};

 

        final String[] morse = {".-", "-...", "-.-/>.", "-..", ".", "..-.", "--.", "....", "..",

          ".---", "-.-/>", ".-..", "--", "-.", "---", ".--.", "--.-/>",  ".-.", "...", "-", "..-",

          "...-" ,".--" ,"-..-", "-.-/>-", "--..", "|"};

        

 

        for(int i = 0; i < alpha.length; ++i)

        {  

            char [] chars = letter.toCharArray();

            

            if(letter.equals(alpha[i]))

            {
//61
              return morse[i];

            }

        }

        return " ";  // not found

    }

    public static String toAlpha(String dot)

    {

        final String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i",

          "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",

          "v", "w", "x", "y", "z", " "};
 

        final String[] morse = {".-", "-...", "-.-/>.", "-..", ".", "..-.", "--.", "....", "..",

          ".---", "-.-/>", ".-..", "--", "-.", "---", ".--.", "--.-/>",  ".-.", "...", "-", "..-",

          "...-" ,".--" ,"-..-", "-.-/>-", "--..", "|"};

 

 

        for(int i = 0; i < morse.length; ++i)

        {

            if(dot.equals(morse[i]))

            return alpha[i];

        }

        return " ";  // not found

    }
}

