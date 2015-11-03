/* Zhenyu Li 
hw08, program 2 
process a string by examining all the characters, or 
just a specified number of characters in the string, and 
determining if they are letters. Let the user enter a 
string and choose if he or she wants to examine all the 
characters or just a certain number
*/ 

import java.util.Scanner; 
public class StringAnalysis {
    public static void main (String[] args){
        int i = 0; 
        int n = 0; 
        int j = 0; 
        double s = 0; 
        int strLength = 0;
        boolean result = true; 
        String answer = "";
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter a String: ");
        String str = input.next(); 
        System.out.print ("Are you checking every character? Enter Y/N: ");
        while (true){
            answer = input.next(); 
            if (answer.equals("Y")){
                result = examing (str, j, strLength);
                if (result = true){
                    System.out.print ("Your String is all letters.");
                }
                else if (result = false){
                System.out.print("You String is not all letters");
                break;
                }
            }
            else if (answer.equals("N")){
                result = examing (str, n, s, i);
                if (result = true){
                    System.out.print ("The characters you want yo check are all letters.");
                }
                else if (result = false){
                System.out.print("The characters you want to check are not all letters");
                break; 
                }
            }
            System.out.println ("ERROR: Invalid input.");
            System.out.print ("Please enter Y or N: ");
            
        }//end of while
        
    }//end of main 
    
    public static boolean examing (String str, int j, int strLength){
        strLength = str.length(); 
        j = 0; 
        while (j<strLength){
        if (Character.isLetter(str.charAt(j))){
            j++;
        }
        else {
        return false; 
        }
        }
        return true;
    }//end of char examing 
    
    public static boolean examing (String str, int n, double s, int i){
        s = 0; 
        i = (int)s; 
        Scanner inputInt = new Scanner (System.in); 
        System.out.print ("Enter the number of characters you want to check: ");
        
        while (true){
            if (inputInt.hasNextInt()){
                n = inputInt.nextInt();
                break;
            }
            System.out.print("  ERROR: Invalid input. Please enter an integer: ");
            inputInt.next();
        }//end of while 
        while (i<n){
            if (Character.isLetter(str.charAt(i))){
                i++;
            }
            else {
                return false;
            }
        }//end of while
        return true; 
        
    }//enf of int examing 
}//end of class 