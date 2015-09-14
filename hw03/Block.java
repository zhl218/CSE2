// Zhenyu Li 
// hw03 part 2
//input: dimensions of a block 
//output: the volume and the surface area 

import java.util.Scanner;

public class Block {
    
    public static void main (String[] args){
        //inputs 
        Scanner myScanner = new Scanner (System.in); 
        System.out.print ("Enter the length of the block: "); 
        double length = myScanner.nextDouble (); 
        System.out.print ("Enter the width of the block: "); 
        double width = myScanner.nextDouble (); 
        System.out.print ("Enter the height of the block: "); 
        double height = myScanner.nextDouble (); 
        
        //calculation 
        double volume = length*width*height; 
        double surfaceArea = length*width*2 + width*height*2 + length*height*2; 
        
        //outputs 
        System.out.println ("The volume of the block of dimensions "+length+" x "
        +width+" x "+height+" is "+volume+". The surface area of the block is "+ 
        surfaceArea + "."); 
        
        
    } //end of main method 
        
}//end of class 