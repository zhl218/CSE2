/* Zhenyu Li 
hw06 program1 
part1: bargraph 
part2: calculate the average daily expenses
       Estimated expenditure for 4 years*/

import java.util.Scanner; 

public class BarGraph {
    
    public static void main (String[] args){
        //part1 
        //inputs 
        double monExpenses;
        double tueExpenses; 
        double wedExpenses; 
        double thuExpenses; 
        double friExpenses; 
        double satExpenses; 
        double sunExpenses; 
        
        Scanner input = new Scanner (System.in); 
        
         System.out.print("Expenses for Monday: "); 
        while(true){
            if (input.hasNextDouble()){
                monExpenses = input.nextDouble();
                break;
            }
            System.out.print("Sorry, you did not enter an integer. Try again: ");
            input.next();
        }
        int monE = (int)(monExpenses + 0.5); 
        
        System.out.print("Expenses for Tuesday: "); 
        while(true){
            if (input.hasNextDouble()){
                tueExpenses = input.nextDouble();
                break;
            }
            System.out.print("Sorry, you did not enter an integer. Try again: ");
            input.next();
        }
        int tueE = (int)(tueExpenses + 0.5); 
        
        System.out.print("Expenses for Wednesday: "); 
        while(true){
            if (input.hasNextDouble()){
                wedExpenses = input.nextDouble();
                break;
            }
            System.out.print("Sorry, you did not enter an integer. Try again: ");
            input.next();
        }
        int wedE = (int)(wedExpenses + 0.5); 
        
        
        System.out.print("Expenses for Thursday: "); 
        while(true){
            if (input.hasNextDouble()){
                thuExpenses = input.nextDouble();
                break;
            }
            System.out.print("Sorry, you did not enter an integer. Try again: ");
            input.next();
        }
        int thuE = (int)(thuExpenses + 0.5); 
        
        System.out.print ("Expenses for Friday: "); 
         while(true){
            if (input.hasNextDouble()){
                friExpenses = input.nextDouble();
                break;
            }
            System.out.print("Sorry, you did not enter an integer. Try again: ");
            input.next();
        }
        int friE = (int)(friExpenses + 0.5); 
        
        
        System.out.print ("Expenses for Saturday: "); 
         while(true){
            if (input.hasNextDouble()){
                satExpenses = input.nextDouble();
                break;
            }
            System.out.print("Sorry, you did not enter an integer. Try again: ");
            input.next();
        }
        int satE = (int)(satExpenses + 0.5); 
        
        System.out.print ("Expenses for Sunday: "); 
         while(true){
            if (input.hasNextDouble()){
                sunExpenses = input.nextDouble();
                break;
            }
            System.out.print("Sorry, you did not enter an integer. Try again: ");
            input.next();
        }
        int sunE = (int)(sunExpenses + 0.5); 
        
        //graph 
        System.out.println("");
        System.out.print ("Mon:    ");
        for (int a = 0; a < monE; a++){
            System.out.print ("*"); 
        }
        System.out.println("");
        System.out.print ("Tues:   ");
        for (int b = 0; b < tueE; b++){
            System.out.print ("*"); 
        }
        System.out.println("");
        System.out.print ("Wed:    ");
        for (int c = 0; c < wedE; c++){
            System.out.print ("*"); 
        }
        System.out.println("");
        System.out.print ("Thu:    ");
        for (int d = 0; d < thuE; d++){
            System.out.print ("*"); 
        }
        System.out.println("");
        System.out.print ("Fri:    ");
        for (int e = 0; e < friE; e++){
            System.out.print ("*"); 
        }
        System.out.println("");
        System.out.print ("Sat:    ");
        for (int f = 0; f < satE; f++){
            System.out.print ("*"); 
        }
        System.out.println("");
        System.out.print ("Sun:    ");
        for (int g = 0; g < sunE; g++){
            System.out.print ("*"); 
        }
        System.out.println("");
        
        //part2
        double aveDailyExpenses = (monExpenses + tueExpenses + wedExpenses + thuExpenses
        + friExpenses + satExpenses + sunExpenses)/7; 
        System.out.printf ("Your average daily expenses are: $" + "%.2f", 
        aveDailyExpenses);
        System.out.println("");
        double estAnnualExpenses = 0; 
        for (int w=0; w<52; w++){
        int percent = (int)(Math.random()*40)-20; 
        double Percent = percent/100; 
        double estWeeklyExpenses = 7*aveDailyExpenses*(1+Percent); 
        estAnnualExpenses += estWeeklyExpenses;
        }
        double fourYears = 4 * estAnnualExpenses; 
        System.out.printf ("Estimated expenditure for 4 years: $" + "%.2f", 
        fourYears);
        System.out.println("");
        
        
    }//end of method 
    
}//end of class 