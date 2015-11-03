/* Zhenyu Li 
hw10 shuffling 
*/

import java.util.Scanner; 

public class Shuffling{
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    for (int i=0; i<52; i++){
      cards[i]=rankNames[i%13]+suitNames[i/13];
      System.out.print(cards[i]+" ");
    }
    //System.out.println("\nPrinting cards:");
    //printArray(cards);
    shuffle(cards);
    //System.out.println("\nPrinting Shuffled cards:");
    printArray(cards);
    hand = randomizeHand(cards);
    //System.out.println("\nPrinting Hand:");
    printArray(hand);
  }
  
  public static void shuffle (String[] list){
    System.out.println("\n\nShuffled");
    for (int i = list.length-1; i>0; i--){
      int rand = (int)(Math.random()*(i+1));
      String temp = list[i];
      list[i] = list[rand];
      list[rand] = temp;
      //System.out.print (list[i]+" ");
    }
  }//end of shuffle
  
  public static String[] randomizeHand(String[] list ){
    System.out.println("\n\nRandomized hand!");
    String[] hand1 = new String[5];
    for (int j = 0; j<hand1.length; j++){
      hand1[j] = list[j];
      //System.out.print (hand1[j]+ " ");
    }
    return hand1;
  }//end of randomizeHand
  
  public static void printArray(String[] list){
    for (int k=0; k<list.length; k++){
      System.out.print (list[k] + " ");
    }
  }
}
