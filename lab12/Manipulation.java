/* Zhenyu Li 
lab12 
Manipulation
*/

public class Manipulation {
    public static void main (String[] args){
        int[] array1 = new int [(int) (Math.random()*10)+10];
        int[] array2 = new int [(int) (Math.random()*10)+10];
        raggedArray(array1);
        raggedArray(array2);
        int[][] array = new int [array1.length][array2.length];
        for (int i = 0; i < array1.length; i++){
            //array[i][0] = array1[i];
            for (int j = 0; j < array2.length; j++){
                array[i][j] = array2[j];
            }
        }
        printArray(array);
        
    }//end of main 
    
    public static int[] raggedArray (int[][] initial){
        for (int i = 0; i < initial.length; i++){
            initial[i] = (int) (Math.random()*2000)-1000; 
        }
        
        return initial; 
    } //end of raggedArray
    
    public static void printArray (int[][] initial){
        for (int i = 0; i < initial.length; i++){
            for (int j = 0; j < initial[i].length; j++){
                System.out.printf (initial[i][j] + " ");
            }
            System.out.println("");
        }
    }//end of printArray
    
    public static void printArray (int[] initial){
        for (int i = 0; i < initial.length; i++){
            System.out.print (initial[i]);
        }
    }//end of printArray 
    
    public static int findSmallest (int[][] initial){
        int min = initial[0][0];
        for (int i = 0; i < initial.length; i++){
            for (int j = 0; j < initial[i].length; j++){
                if (initial[i][j] < min){
                    min = initial[i][j];
                }
            }
        }
        return min; 
    }//end of findSmallest
    
    public static int findLargest (int[][] initial){
        int max = initial[0][0]; 
        for (int i = 0; i < initial.length; i++){
            for (int j = 0; j < initial[i].length; j++){
                if (initial[i][j] > max){
                    max = initial[i][j];
                }
            }
        }
        return max; 
    }//end of findLargest 
    
}//end of class 