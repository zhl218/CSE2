//Zhenyu Li 
//hw04 
//randomly pick five cards 
//identify the combination 
//

import java.lang.Math; 
import java.util.Scanner; 

public class PokerHandCheck {
    public static void main (String[] args){
        //generate a number 
        int pick1 = (int)(Math.random()*52)+1; 
        int pick2 = (int)(Math.random()*52)+1; 
        int pick3 = (int)(Math.random()*52)+1;
        int pick4 = (int)(Math.random()*52)+1;
        int pick5 = (int)(Math.random()*52)+1;
        
        //suits 1
        String suit1="";
        if (pick1>=1 && pick1<=13){
            suit1 = ("diamonds"); 
            
        }
         if (14<=pick1 && pick1<=26){
             suit1 = ("clubs"); 
         }
         
         if (27<=pick1 && pick1<=39){
             suit1 = ("hearts");
         } 
         
         if (40<=pick1 && pick1<=51){
             suit1 = ("spades");
         } 
         
         //number 
         String num1=""; 
        switch (pick1%13){
            case 1: {
                num1 = ("Ace"); 
                break;
            }
            case 2: {
                num1 = ("2");
                break; 
            }
            case 3: {
                num1 = ("3"); 
                break; 
            }
            case 4: {
                num1 = ("4"); 
                break; 
            }
            case 5: {
                num1 = ("5"); 
                break; 
            } 
            case 6: {
                num1 = ("6"); 
                break; 
            }
            case 7: {
                num1 = ("7");
                break;
            }
            case 8: {
                num1 = ("8"); 
                break; 
            }
            case 9: {
                num1 = ("9");
                break;
            }
            case 10: {
                num1 = ("10");
                break;
            }
            case 11: {
                num1 = ("Jack");
                break;
            }
            case 12: {
                num1 = ("Queen");
                break;
            }
            case 13: {
                num1 = ("King"); 
                break;
            }
        } //end of switch1
        
        //suit2
        String suit2="";
        if (pick2>=1 && pick2<=13){
            suit2 = ("diamonds"); 
            
        }
         if (14<=pick2 && pick2<=26){
             suit2 = ("clubs"); 
         }
         
         if (27<=pick2 && pick2<=39){
             suit2 = ("hearts");
         } 
         
         if (40<=pick2 && pick2<=51){
             suit2 = ("spades");
         } 
         
         //number 
         String num2=""; 
        switch (pick2%13){
            case 1: {
                num2 = ("Ace"); 
                break;
            }
            case 2: {
                num2 = ("2");
                break; 
            }
            case 3: {
                num2 = ("3"); 
                break; 
            }
            case 4: {
                num2 = ("4"); 
                break; 
            }
            case 5: {
                num2 = ("5"); 
                break; 
            } 
            case 6: {
                num2 = ("6"); 
                break; 
            }
            case 7: {
                num2 = ("7");
                break;
            }
            case 8: {
                num2 = ("8"); 
                break; 
            }
            case 9: {
                num2 = ("9");
                break;
            }
            case 10: {
                num2 = ("10");
                break;
            }
            case 11: {
                num2 = ("Jack");
                break;
            }
            case 12: {
                num2 = ("Queen");
                break;
            }
            case 13: {
                num2 = ("King"); 
                break;
            }
        } //end of switch
        
        //suits 3
        String suit3="";
        if (pick3>=1 && pick3<=13){
            suit3 = ("diamonds"); 
            
        }
         if (14<=pick3 && pick3<=26){
             suit3 = ("clubs"); 
         }
         
         if (27<=pick3 && pick3<=39){
             suit3 = ("hearts");
         } 
         
         if (40<=pick3 && pick3<=51){
             suit3 = ("spades");
         } 
         
         //number 
         String num3=""; 
        switch (pick3%13){
            case 1: {
                num3 = ("Ace"); 
                break;
            }
            case 2: {
                num3 = ("2");
                break; 
            }
            case 3: {
                num3 = ("3"); 
                break; 
            }
            case 4: {
                num3 = ("4"); 
                break; 
            }
            case 5: {
                num3 = ("5"); 
                break; 
            } 
            case 6: {
                num3 = ("6"); 
                break; 
            }
            case 7: {
                num3 = ("7");
                break;
            }
            case 8: {
                num3 = ("8"); 
                break; 
            }
            case 9: {
                num3 = ("9");
                break;
            }
            case 10: {
                num3 = ("10");
                break;
            }
            case 11: {
                num3 = ("Jack");
                break;
            }
            case 12: {
                num3 = ("Queen");
                break;
            }
            case 13: {
                num3 = ("King"); 
                break;
            }
        } //end of switch3 
        
        //suits 4
        String suit4="";
        if (pick4>=1 && pick4<=13){
            suit4 = ("diamonds"); 
            
        }
         if (14<=pick4 && pick4<=26){
             suit4 = ("clubs"); 
         }
         
         if (27<=pick4 && pick4<=39){
             suit4 = ("hearts");
         } 
         
         if (40<=pick4 && pick4<=51){
             suit4 = ("spades");
         } 
         
         //number 
         String num4=""; 
        switch (pick4%13){
            case 1: {
                num4 = ("Ace"); 
                break;
            }
            case 2: {
                num4 = ("2");
                break; 
            }
            case 3: {
                num4 = ("3"); 
                break; 
            }
            case 4: {
                num4 = ("4"); 
                break; 
            }
            case 5: {
                num4 = ("5"); 
                break; 
            } 
            case 6: {
                num4 = ("6"); 
                break; 
            }
            case 7: {
                num4 = ("7");
                break;
            }
            case 8: {
                num4 = ("8"); 
                break; 
            }
            case 9: {
                num4 = ("9");
                break;
            }
            case 10: {
                num4 = ("10");
                break;
            }
            case 11: {
                num4 = ("Jack");
                break;
            }
            case 12: {
                num4 = ("Queen");
                break;
            }
            case 13: {
                num4 = ("King"); 
                break;
            }
        } //end of switch4 
        
        //suits 5
        String suit5="";
        if (pick5>=1 && pick5<=13){
            suit5 = ("diamonds"); 
            
        }
         if (14<=pick5 && pick5<=26){
             suit5 = ("clubs"); 
         }
         
         if (27<=pick5 && pick5<=39){
             suit5 = ("hearts");
         } 
         
         if (40<=pick5 && pick5<=51){
             suit5 = ("spades");
         } 
         
         //number 
         String num5=""; 
        switch (pick5%13){
            case 1: {
                num5 = ("Ace"); 
                break;
            }
            case 2: {
                num5 = ("2");
                break; 
            }
            case 3: {
                num5 = ("3"); 
                break; 
            }
            case 4: {
                num5 = ("4"); 
                break; 
            }
            case 5: {
                num5 = ("5"); 
                break; 
            } 
            case 6: {
                num5 = ("6"); 
                break; 
            }
            case 7: {
                num5 = ("7");
                break;
            }
            case 8: {
                num5 = ("8"); 
                break; 
            }
            case 9: {
                num5 = ("9");
                break;
            }
            case 10: {
                num5 = ("10");
                break;
            }
            case 11: {
                num5 = ("Jack");
                break;
            }
            case 12: {
                num5 = ("Queen");
                break;
            }
            case 13: {
                num5 = ("King"); 
                break;
            }
        } //end of switch 5
      
        
    //combination check
    int same = 0; 
    if (num1==num2) {
            same=same+1; 
        }
        
    if (num1==num3) {
            same=same+1; 
        }
        
    if (num1==num4) {
            same=same+1; 
        }
        
    if (num2==num5) {
            same=same+1; 
        }
        
    if (num2==num3) {
            same=same+1; 
        }
        
    if (num2==num4) {
            same=same+1; 
        }
        
    if (num2==num5) {
            same=same+1; 
        }
        
    if (num3==num4) {
            same=same+1; 
        }
        
    if (num3==num5) {
            same=same+1; 
        }
        
    if (num4==num5) {
            same=same+1; 
        }
        
        //compare
        String compare = ""; 
        if (same==0) {
            compare = ("You have a high card hand!");
        }
        if (same==1) {
            compare = ("You have a pair!");
        }
        if (same==2){
            compare = ("You have two pairs!"); 
        } 
        if (same==3) {
            compare = ("You have three of a kind!"); 
        }
        if (same==4) {
            compare = ("You have three of a kind and a pair!"); 
        }
        if (same==6) {
            compare = ("You have four of a kind!"); 
        }
        if (same==10) {
            compare = ("You have five of a kind!"); 
        }
        
       
       //print       
    System.out.println ("Your random cards were:"); 
    System.out.println ("the "+num1+ " of " + suit1); 
    System.out.println ("the "+num2+ " of " + suit2); 
    System.out.println ("the "+num3+ " of " + suit3); 
    System.out.println ("the "+num4+ " of " + suit4); 
    System.out.println ("the "+num5+ " of " + suit5); 
    System.out.println (compare); 
    
        
    
        
    } //end of main method
    
    
}//end of class