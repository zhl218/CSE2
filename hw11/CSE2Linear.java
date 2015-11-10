/* Zhenyu Li
hw11 CSE2Linear.java
prompts the user to enter 15 ints for students’ final grades 
in CSE2. Check that the user only enters ints, and print an 
error message if the user enters anything other than an int.  
Print a different error message for an int that is out of the 
range from 0-100
scramble the sorted array randomly, and print out the scrambled 
array. Prompt the user again to enter an int to be searched for, 
and use linear search to find the grade. Indicate if the grade was 
found or not, and how many iterations it took.
Write separate methods for linear search, binary search, selection/insertion 
sort, and random scrambling
*/ 
import java.util.Scanner; 
import java.util.Random; 

public class CSE2Linear{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int [] grades = new int [15];
        System.out.print("Enter 15 ints for final grades in CSE2: ");
        
        for (int i = 0; i<15; i++){
            while(true){
                if(input.hasNextInt()){
                    int x = input.nextInt();
                    if(x >= 0 && x <= 100){ 
                        grades[i] = x;
                        break;
                    }
                    else 
                        System.out.println("ERROR: INPUT HAS TO BE BETWEEN 0 AND 100");
                }
                else if(input.hasNextInt() == false){
                    System.out.println("ERROR: INPUT IS NOT AN INT");
                    input.next();
                }
            }
        }//end of for loop 
        
        for(int i = 0; i< grades.length; i++){
            System.out.print(grades[i] + " ");
        }
        System.out.println(" ");
        
        System.out.println ("Sorted: ");
        grades = selectionSort(grades);
        
        System.out.println();
        System.out.print ("Enter a grade to search for: ");
        int searchGrade1 = input.nextInt();
        binary(grades, searchGrade1);
        
        
        System.out.println ("Scramble: ");
        scramble(grades);
        for(int i = 0; i < grades.length; i++){
            System.out.print(grades[i] + " ");
        }
        
        System.out.println (" ");
        System.out.print ("Enter a grade to search for: ");
        int searchGrade2 = input.nextInt(); 
        linear(grades, searchGrade2);

    }//end of main 
    
    public static void sorted(int[] initial){
        int[] temp = new int[initial.length];
        for (int i = 0; i < initial.length; i++){
            temp[i] = initial[i];
        }
        for (int i = 0; i < initial.length; i++){
            for (int j = i+1; j < initial.length; j++){
                if (initial[i] < temp[j]){
                    initial[i] = initial[j];
                    initial[j] = temp[j];
                    System.out.print (initial[i] + " ");
                }
            }
        }
    }//end of sorted 
    public static int[] selectionSort(int[] initial){
        int pos = 0; 
        int min = 0; 
        for (int i =0; i < initial.length-1; i++){
            min = initial[i];
            pos = i; 
            for (int j = i+1; j< initial.length; j++){
                if (min > initial[j]){
                    min = initial[j];
                    pos = j; 
                }
            }
            int temp = initial[i];
            initial[i] = min;
            initial[pos] = temp;
        }
        for(int i = 0; i < initial.length; i++)
        {
            System.out.print(initial[i] + " ");
        }
        return initial;
    }
    
    public static int binary(int[] initial, int searchNumber){
        int midpoint = (int) (initial.length-1)/2;
        int middle = initial[midpoint]; 
        int beg = 0;
        int end = initial.length - 1; 
        int iterations = 0;
        boolean isFound = false;
        while (!isFound){
            midpoint = (int) ((beg+end)/2);
            middle = initial [midpoint];
            iterations++;
                if (middle == searchNumber){
                    isFound = true;
                    System.out.println (searchNumber + " was found in the list with "+iterations+" iterations");
                }  
                else if (middle < searchNumber){
                    beg = midpoint + 1; 
                }
                else {
                    end = midpoint -1;
                }
                if (beg > end){
                    System.out.println (searchNumber + " was not found in the list with " + iterations + " iterations");
                    break;
                }
        }
        
        return iterations;
    }//end of binary
    
    public static int linear(int[] initial, int searchNumber) {
        boolean isFound = false;
        int iterations = 0; 
        for (int j = 0; j < initial.length; j++){
            if (searchNumber == initial[j]){
                isFound = true;
                iterations = j; 
                break;
            }
            iterations = j;
            isFound = false; 
        }
        if (isFound ==true){
            System.out.println(searchNumber + " was found in the list with " + iterations + " iterations");
        }
        else if (isFound == false){
            System.out.println (searchNumber + " was not found in " + iterations + " iterations");
        }
        return iterations; 
    }//end of linear
    
    public static void scramble(int[] initial){
        int[] temp = new int[initial.length];
        Random r = new Random();
        for(int i = 0; i < initial.length; i++){
            temp[i] = initial[i];
        }
        for(int i = 0; i < initial.length; i++){
            int index = r.nextInt(initial.length);
            while(temp[index] == -1){
                index = r.nextInt(initial.length);
            }
            initial[i] = temp[index];
            temp[index] = -1;
        }
    }//end of scramble 
}//end of class 
