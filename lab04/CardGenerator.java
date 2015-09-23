//Zhenyu Li 
//lab04-CardGenerator 
//Cards 1-13 represent the diamonds, 
//14-26 represent the clubs, 27-39 hearts, 40-52 spades

import  java.lang.Math; 
public class CardGenerator {
    public static void main (String[] args){
        //generate a number 
        int pick = (int)(Math.random()*52)+1; 
        
        //suits 
        String suit="";
        if (pick>=1 && pick<=13){
            suit = ("diamonds"); 
            
        }
         if (14<=pick && pick<=26){
             suit = ("clubs"); 
         }
         
         if (27<=pick && pick<=39){
             suit = ("hearts");
         } 
         
         if (40<=pick && pick<=51){
             suit = ("spades");
         } 
         
         //number 
         String num=""; 
        switch (pick%13){
            case 1: {
                num = ("Ace"); 
                break;
            }
            case 2: {
                num = ("2");
                break; 
            }
            case 3: {
                num = ("3"); 
                break; 
            }
            case 4: {
                num = ("4"); 
                break; 
            }
            case 5: {
                num = ("5"); 
                break; 
            } 
            case 6: {
                num = ("6"); 
                break; 
            }
            case 7: {
                num = ("7");
                break;
            }
            case 8: {
                num = ("8"); 
                break; 
            }
            case 9: {
                num = ("9");
                break;
            }
            case 10: {
                num = ("10");
                break;
            }
            case 11: {
                num = ("Jack");
                break;
            }
            case 12: {
                num = ("Queen");
                break;
            }
            case 13: {
                num = ("King"); 
                break;
            }
            
            
        } //end of switch 
        
    System.out.println ("You picked the "+num+" of "+suit); 
    
    
        
    }//end of main method
    
}//end of class 