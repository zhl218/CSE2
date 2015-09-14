// Zhenyu Li 
//hw03 
//input: the current time and dinner time 
//output: the amount of time until dinner 

import java.util.Scanner; 

public class Timer {
    
    public static void main (String[] args){
        //get the user inputs 
        Scanner myScanner = new Scanner (System.in); 
        System.out.print ("Enter the current time: "); 
        int currentTime = myScanner.nextInt (); 
        System.out.print ("Enter the time that you will be eating dinner: "); 
        int dinnerTime = myScanner.nextInt (); 
    
        //calculation 
        int hours; 
        int minutes; 
        int time = dinnerTime-currentTime; 
        hours = (int) time/100; 
        minutes = (int) (time%100);
        
        if (minutes >60) {
            hours = hours +1; 
            minutes = minutes - 60; 
        } 
        
        //outputs
        System.out.println ("You have " + hours + " hours and " + 
        minutes + " minutes until dinner."); 
        
    } //end of main method 
} //end of class 