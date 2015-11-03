/* Zhenyu Li 
lab 10
one-dimensional array */ 

import java.util.Scanner; 

public class Array {
    public static void main (String[] args){
      String[] students = new String [(int) (Math.random()*5)+5]; 
      Scanner input = new Scanner(System.in); 
      System.out.println ("Eneter "+students.length+" student names: ");
      for (int i = 0; i<students.length; i++){
          students[i] = input.next();
      }
      int[] grades = new int[students.length];
      for (int j = 0; j<students.length; j++){
          grades[j] = (int) (Math.random()*100);
      }
      System.out.println("Here are the midterm grades of the "+students.length+"  students above:");
      for (int k = 0; k<students.length; k++){
          System.out.println(students[k]+ " : "+ grades[k]);
      }
        
    }//end of main 
    
}//end of class 