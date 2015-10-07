/* Zhenyu Li 
hw06 program2 
Books contain ISBNs which are a series of 10 or 13 digits 
visually represented as barcodes. The last digit of an ISBN is 
called the check digit or checksum and can help a barcode reader 
determine whether it properly read a barcode or missed some bits 
based on a formula.
*/

import java.util.Scanner; 
import java.lang.*;

public class CheckDigit {
    
    public static void main (String[] args){
        String isbn = ("");
        int length = isbn.length(); 
        Scanner input = new Scanner (System.in); 
        
        System.out.print("Please enter a 10 digit barcode: ");
        isbn = input.next();
      
        while (true){
            length = isbn.length();
            if (length == 10 || length == 13){
                System.out.print ("");
                break; 
            }
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
            isbn = input.next();
        }//end of while 
        
        //subString 
        String d1 = isbn.substring (0,1); 
        int num1 = Integer.parseInt(d1);
        String d2 = isbn.substring (1,2);
        int num2 = Integer.parseInt(d2);
        String d3 = isbn.substring (2,3); 
        int num3 = Integer.parseInt(d3);
        String d4 = isbn.substring (3,4); 
        int num4 = Integer.parseInt(d4);
        String d5 = isbn.substring (4,5);
        int num5 = Integer.parseInt(d5);
        String d6 = isbn.substring (5,6); 
        int num6 = Integer.parseInt(d6);
        String d7 = isbn.substring (6,7); 
        int num7 = Integer.parseInt(d7);
        String d8 = isbn.substring (7,8);
        int num8 = Integer.parseInt(d8);
        String d9 = isbn.substring (8,9);
        int num9 = Integer.parseInt(d9);
        String dx = isbn.substring (9,10);
        int num10 = 0; 
        if (dx.equals("x") || dx.equals("X")){
            num10 = 10;
        }
        else {
            num10 = Integer.parseInt (dx);
        }
        
        int product1 = num1*10;
        int product2 = num2*9; 
        int product3 = num3*8;
        int product4 = num4*7;
        int product5 = num5*6;
        int product6 = num6*5;
        int product7 = num7*4;
        int product8 = num8*3;
        int product9 = num9*2;
        int sum = product1+product2+product3+product4+product5+product6+
        product7+product8+product9; 
        int CheckD = sum%11 - 1; 
        if (num10 == CheckD){
            System.out.println ("This is a valid ISBN.");
        }
        else if (CheckD ==10) {
            System.out.println ("This is NOT a valid ISBN. Check digit should be X."); 
        }
        else {
            System.out.println ("This is NOT a valid ISBN. Check digit should be " + CheckD+".");
        }
        

        
        
        
    } //end of method 
}//end of class