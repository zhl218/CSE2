/* Zhenyu Li 
hw12 Transpose 
randomMatrix() wdith and height  
*/

import java.util.Scanner; 

public class Transpose {
    public static void main (String[] args){
        int height = 0; 
        int width = 0; 
        Scanner input = new Scanner (System.in); 
        System.out.print ("Please enter the height of the matrix: ");
        while (true){
            if (input.hasNextInt()){
                height = input.nextInt();
                if (height > 0){
                    break;
                }
                else
                System.out.print (" ERROR: must be a positive integer. Please try again: ");
            }
            else if (input.hasNextInt() == false){
            System.out.print (" ERROR: must be a positive integer. Please try again: ");
            input.next(); 
            }
        }
        
        System.out.print ("Please enter the width of the matrix: ");
        while (true){
            if (input.hasNextInt()){
                width = input.nextInt();
                if (width > 0){
                    break;
                }
                else
                System.out.print("  ERROR: must be a positive integer. Please try again: ");
            }
            else if (input.hasNextInt() == false){
            System.out.print (" ERROR: must be a positive integer. Please try again: ");
            input.next(); 
            }
        }
        int[][] matrix = randomMatrix(height,width);
        System.out.println("Old Matrix:");
        printMatrix(matrix);
        System.out.println("\nNewMatrix:");
        int[][] transposedMatrix = transposeMatrix(matrix);
        printMatrix(transposedMatrix);
        
    }//end of main 
    
    public static int[][] randomMatrix(int h, int w){
        int[][] matrix = new int [h][w];
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                matrix[i][j] = (int)(Math.random()*20)-10;
            }
        }
        return matrix; 
    }
    
    public static void printMatrix(int[][] m){
        int firstLength = m[0].length;
        boolean warning = false;
        
        for (int i = 0; i < m.length; i++){
            if(firstLength != m[i].length){
                warning = true;
            }

        }
        if(!warning){
            for(int i = 0; i < m.length; i++)
            {
            
                for(int j = 0; j < m[i].length; j++){
                    System.out.printf("%3d"+"\t", m[i][j]);
                }
                System.out.print("\n");
            }
        }
        if(warning){
            System.out.println("This is a ragged array");
            //print warning
        }
    }//end of print 
    
    public static int[][] transposeMatrix(int[][] m) {
        int newlength = m.length;
        int newheight = m[0].length;
        int[][] nMatrix = new int[newheight][newlength];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                nMatrix[j][i] = m[i][j];
            }
        }
        return nMatrix;
    }
}//end of class 
    