// Zhenyu Li 
//Arithmetic jave program 
//compute the cost of the items including PA sales tax 6% 
//outputs include: Total cost of each kind of item; sales tax for that total cost
//Total cost of purchases (before tax)
//Total actually paid for this transaction, including sales tax 

public class Arithmetic {
    
    public static void main (String[] arg){
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        double taxPercent=0.06; //tax 
        
        double totalSockCost$ = ((int) (nSocks*sockCost$*100))/100.0;   //total cost of socks
        double totalSockCostAfterTax = ((int) ((totalSockCost$*taxPercent+totalSockCost$)*100))/100.0; //socks after tax 
        
        double totalglassCost$ = ((int) (nGlasses*glassCost$*100))/100.0; //total cost of glass 
        double totalglassAfterTax = ((int) ((totalglassCost$*taxPercent+totalglassCost$)*100))/100.0; //glass after tax
        
        double totalenvelopCost$ = nEnvelopes*envelopeCost$; // total cost of envelopes
        double totalenvelopAfterTax = ((int) ((totalenvelopCost$*taxPercent+totalenvelopCost$)*100))/100.0; //envelopes after tax 
        
        double totalCostBeforeTax$ = ((int) ((totalSockCost$ + totalglassCost$ + totalenvelopCost$)*100))/100.0;
        double totalCostAfterTax$ = ((int) ((totalCostBeforeTax$*taxPercent+totalCostBeforeTax$)*100))/100.0; 
        
        //print out the results 
        System.out.println("The cost of socks before tax: $"+totalSockCost$+"\nThe cost of sockd after tax: $"+totalSockCostAfterTax);
        System.out.println("The cost of glass before tax: $"+totalglassCost$+"\nThe cost of glass after tax: $"+totalglassAfterTax); 
        System.out.println("The cost of envelopes before tax: $"+totalenvelopCost$+"\nThe cost of envelopes after tax: $"+totalenvelopAfterTax); 
        System.out.println("The cost of purchases(before tax): $"+ totalCostBeforeTax$); 
        System.out.println("The total payment: $"+ totalCostAfterTax$); 
        
        


    }
}