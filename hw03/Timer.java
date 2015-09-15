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
        int currentHours; 
        int currentMinutes; 
        currentHours = (int) currentTime/100; 
        currentMinutes = (int) (currentTime%100);
        
        int dinnerHours; 
        int dinnerMinutes; 
        dinnerHours = (int) dinnerTime/100; 
        dinnerMinutes = (int) (dinnerTime%100); 
        
        int hours = dinnerHours-currentHours; 
        int minutes = dinnerMinutes-currentMinutes; 
        
        
        if (minutes >60) {
            hours = hours +1; 
            minutes = minutes-60; 
        } 
        
        //outputs
        System.out.println (minutes); 
        System.out.println ("You have " + hours + " hours and " + 
        minutes + " minutes until dinner."); 
        
    } //end of main method 
} //end of class 