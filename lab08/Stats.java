/* Zhenyu Li 
lab08
main method asks the user to input 5 doubles, from smallest to largest
One method that calculates the mean
One method to calculate the median
One void method called print to print out the results
*/ 

import java.util.Scanner; 

public class Stats {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter 5 double from smallest to largest: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();
        
        while (true){
        if (num2 > num1){
        //double num2 = input.nextDouble();
        break;
        }
        else {
        System.out.print("The number should be greater than the previous numer.");
        System.out.print("Please enter the new double: ");
        }
        }//end of while 
        
        while (true){
        if (num3 > num2){
        //double num3 = input.nextDouble();
        break;
        }
        else {
        System.out.print("The number should be greater than the previous numer.");
        System.out.print("Please enter the new double: ");
        }
        }//end of while 
        
        while (true){
        if (num4 > num3){
        //double num4 = input.nextDouble();
        break;
        }
        else {
        System.out.print("The number should be greater than the previous numer.");
        System.out.print("Please enter the new double: ");
        }
        }//end of while 
        
        while (true){
        if (num5 > num4){
        //double num5 = input.nextDouble();
        break;
        }
        else {
        System.out.print("The number should be greater than the previous numer.");
        System.out.print("Please enter the new double: ");
        }
        }//end of while 
        double calculatedMean = mean (num1, num2, num3, num4, num5);
        double calculatedMedian = median (num3);
        printResults (calculatedMean, calculatedMedian);
        //median (num1, num2, num3, num4, num5);
        
    }//end of main 
    
    public static double mean (double num1, double num2, double num3, double num4, double num5){
        double mean = (num1+num2+num3+num4+num5)/5; 
        return mean; 
    }//end of mean
    
    public static double median (double num3){
        return num3;
    }//end of median
    
    public static void printResults (double mean, double median){
        System.out.print("The mean is: ");
        System.out.println(mean); 
        System.out.print("The median is: ");
        System.out.println(median);
        
    }
    
}//end of class 