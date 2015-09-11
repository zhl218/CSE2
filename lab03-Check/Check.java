//Zhenyu Li 
//lab03-check 
//original cost of the check, the percentage tip they wish to pay, and the number of ways the check will be split
//how much each person in the group needs to pay 


import java.util.Scanner;
public class Check{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			    //get user inputs
   			    Scanner myScanner = new Scanner (System.in); 
   			    System.out.print ("Enter the original cost of the check in the form xx.xx: "); 
   			    double checkCost = myScanner.nextDouble (); 
   			    System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); 
   			    double tipPercent = myScanner.nextDouble (); 
   			    tipPercent /=100; // convert the percentage into a decimal value 
   			    System.out.print ("Enter the number of people who went out to dinner: "); 
   			    int numPeople = myScanner.nextInt (); 
   			    
   			    //print out the output 
   			    double totalCost; 
   			    double costPerPerson; 
   			    int dollars; //whole dollar amount of coast 
   			    int dimes; 
   			    int pennies; 
   			    totalCost = checkCost * (1+tipPercent); 
   			    costPerPerson = totalCost/numPeople; 
   			    dollars = (int)costPerPerson; 
   			    dimes = (int)(costPerPerson * 10) %10; 
   			    pennies = (int)(costPerPerson * 100) %10; 
   			    System.out.println ("Each person in the group owns $" + dollars + "." + dimes + pennies); 
   			    
   			    
   			    

}  //end of main method   
  	} //end of class

