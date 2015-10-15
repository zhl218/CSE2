/* Zhenyu Li 
hw 07 
Length is to specify how many characters the following pattern should spread, 
horizontally, across the screen.  Width should specify how many characters 
the following pattern should spread, vertically, across the screen. 
The pattern is always composed of two twists, a slash-based twist, and a hashtag-based 
twist.  When the desired width is odd, then the hashtag and the slash alternate in front 
Reject any input where the requested width is larger than the requested length, or when 
the requested length is greater than 80.
*/

import java.util.Scanner; 

public class Twisty {
    public static void main (String[] args){
        int length = 0; 
        int width = 0; 
        boolean acceptable = false; 
        Scanner input = new Scanner (System.in);
        System.out.print ("Input your desired length: ");
        while (!acceptable){
            if (input.hasNextInt()){
                length = input.nextInt();
                if (length <= 80){
                 break;
                }
                else{
                  System.out.println (" ERROR: the length cannot be greater than 80.");
                  System.out.print ("Input your desired length: ");
                }
            }
            else
                {
                System.out.println("    ERROR: please type in an integer.");
                System.out.print("Input your desired length: ");
                input.next();
                }
        }
        

        System.out.print ("Input your desired width: ");
        while (!acceptable){
            if (input.hasNextInt()){
                width = input.nextInt();
                if (length >= width){
                break;
                }
                else{
                    System.out.println ("   ERROR: the width cannot be greater than the length.");
                    System.out.print ("Inuput your desired width: ");
                }
            }
                System.out.println("    ERROR: please type in an integer.");
                System.out.print("Input your desired width: ");
                input.next();
            }
            
        for (int i=0; i<length+1; i++){
            for (int j=0; j<width+1; j++){
                if (i==j-1){
                    System.out.print ("#");
                }
                else if (j==width-i-1){
                    System.out.print ("/");
                }
                else if (width==i+j){
                    System.out.print("\\");
                }
                else if (j==width-i+3){
                    System.out.print("#");
                }
                else
                System.out.print(" ");
            }
            System.out.println("");
        }
       
        
    }//end of main method 
}//end of class 