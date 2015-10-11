/* Zhenyu Li 
lab07
developing a program to hide the secret message X. Instead of printing out X 
which everyone can see clearly, we will bury the character in a handful of stars.
*/ 

import java.util.Scanner; 

public class encrypted_x {
    public static void main (String[] args){
        int num = 0; 
        boolean acceptable = false;
        Scanner input = new Scanner (System.in); 
        System.out. print ("Enter an integer between 0 - 100: "); 
        //check input 
        num = input.nextInt();
        while (!acceptable) {
            if (num > 0 && num < 101){
                break; 
            }
            else {
                System.out.println("   ERROR: need an integer");
                System.out.print("Input your integer: ");
                num = input.nextInt();
            }
        }
        
        //print X 
        for (int i=0; i<num+1; i++){
            //System.out.println ("*");
            for (int j=0; j<num+1; j++){
                if (i==j){
                    System.out.print (" ");
                  
                }
                else if (j==num-i){
                System.out.print (" ");
            }
                else
                System.out.print ("*");
                
            }
            System.out.println ("");
        }
        
        
        
        
    }//end of main method 
    
} //end of class 