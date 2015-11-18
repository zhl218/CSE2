/* Zhenyu Li 
lab11 searching 
perform linear and binary search 
on large arrays of random numbers
*/
import java.util.Scanner; 

public class Search {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] array1 = new int [5000];
        int [] array2 = new int [5000];
        for (int i = 0; i<array1.length- 1; i++){
            array1[i] = (int)(Math.random()*(100000));
        }
        for (int i = 0; i<100; i++){
            System.out.print (array1[i] + " ");
        }
        //System.out.println(array1);
        int max1 = array1[0];
        int min1 = array1[0];
        for (int j = 0; j<array1.length; j++){
            if (array1[j]>max1){
                max1 = array1[j];
            }
            //else 
            //max1 = array1[0];
        }
        for (int k = 0; k<array1.length; k++){
            if (array1[k]<min1){
                min1 = array1[k];
            }
            //else 
            //min1 = array1[0];
        }
        System.out.println ("The maximum of array1 is: "+max1);
        System.out.println ("The minimum of array1 is: "+min1);
        
        //array2
        array2[0] = (int)(Math.random()*(95000));
        int min2 = array2[0];
        for (int s = 1; s<array2.length - 1; s++){
            array2[s] = (int)(Math.random()*(95000+s)+array2[s-1]);
        }
        System.out.println ("The maximum of array2 is: "+array2[4999]);
        System.out.println ("The minimum of array2 is: "+array2[0]);
    }
}