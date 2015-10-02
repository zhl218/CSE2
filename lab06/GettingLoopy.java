/* Zhenyu Li
lab06-Getting Loopy 
    Step 1: a simple loop that generates a sequence of numbers up to 7. 
Use another loop to print out multiple 7s.
    Step2: Create a while loop that prints all of the prime numbers 
from 10 - 100. 
    Step3: Use any loop to print out a random number of these smiley faces ツ 
(or any other symbol) using the Math.random() method */


import java.lang.Math; 

public class GettingLoopy {
    public static void main (String[] args){
        //step 1
        System.out.println ("Step 1:");
        for (int i=1; i<8; i++) {
            System.out.print (i);
        }//end of for
        for (int s=1; s<7; s++) {
            System.out.print ("7");
        }//end of for
        System.out.print ("\n"); 
        
        //step 2
        int pnum1 = 11; 
        System.out.println ("Step 2: ");
        System.out.print ("WHILE LOOP: ");
        while (pnum1 < 101) {
            if (pnum1%2!=0 && pnum1%3!=0 && pnum1%5!=0 
            && pnum1%6!=0 && pnum1%7!=0 && pnum1%8!=0) {
            System.out.print (pnum1+" "); 
        }
         pnum1++;    
        }//end of while
        System.out.println("");
        System.out.print ("FOR LOOP: "); 
        for (int pnum2 = 11; pnum2 < 101; pnum2++) {
            if (pnum2%2!=0 && pnum2%3!=0 && pnum2%5!=0 
            && pnum2%6!=0 && pnum2%7!=0 && pnum2%8!=0) {
            System.out.print (pnum2+" "); 
        }
        }//end of for 
        
        System.out.println(""); 
        System.out.print ("DO WHILE LOOP: "); 
        int pnum3 = 11; 
        do {
            if (pnum3%2!=0 && pnum3%3!=0 && pnum3%5!=0 
            && pnum3%6!=0 && pnum3%7!=0 && pnum3%8!=0) {
            System.out.print (pnum3+" "); 
        }
            pnum3++;
        } while (pnum3<101); 
        
        //step 3
        System.out.print("\n"); 
        System.out.print ("Step 3: "); 
        int radNum = (int) (Math.random()*195)+5; 
        for (int startNum = 1; startNum < radNum+1; startNum++){
            System.out.print ("ツ"); 
        }
        
        
        
    } //end of main method
    
}// end of class 
