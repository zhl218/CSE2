/* Zhenyu Li 
hw08, program 1
Write a program that can calculate the area of three different shapes; 
a rectangle, a triangle and a circle. Let the user choose which shape 
they want by typing the words “rectangle”, “triangle” or “circle” 
(without caps).  Then, have the user enter the values of the dimension(s) 
appropriate for each shape in the form of doubles. 
*/

import java.util.Scanner; 
public class Area {
    public static void main (String[] args){
        String r = "rectangle";
        String t = "triangle";
        String c = "circle";
        String shape; 
        String userShape = Shape(); 
        double area = 0; 
        double length = 0; 
        double width = 0; 
        double base = 0; 
        double height = 0; 
        double radius = 0; 
        if (userShape.equals(r)){
            area = areaOfRectangle(length, width);
        }
        if (userShape.equals(t)){
            area = areaOfTriangle(base, height);
        }
        if (userShape.equals(c)){
            area = areaOfCircle (radius);
        }
        System.out.print ("The area of your shape is "+ area+ ".");
        
    }//end of main 
    public static String Shape (){
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter a shape (rectangle, triangle or circle): ");
        //String shape = input.next();
        String shape = "";
        
        while (true){
            shape = input.next();
            
            if (shape.equals("rectangle") || shape.equals("triangle") || 
            shape.equals("circle")){
                
                break; 
            }
            else {
                System.out.println("  Error: Invalid input.");
                System.out.print("Please enter one of the following shapes: rectangle, triangle or circle: ");
            }
        }//end of while 
        return shape; 
    }//end of shape
        
        public static double areaOfRectangle (double length, double width){
            Scanner inputR = new Scanner (System.in);
            System.out.print ("Enter the length of the rectangle: ");
            while (true){
                if (inputR.hasNextDouble()){
                    length = inputR.nextDouble();
                    break;
                }
                System.out.print("Invalid input. Please enter an integer: ");
                inputR.next(); 
            }//end of while 
            System.out.print("Enter the width of the rectangle: ");
            while (true){
                if (inputR.hasNextDouble()){
                    width = inputR.nextDouble();
                    break;
                }
                System.out.print("Invalid input. Please enter an integer: ");
                inputR.next(); 
            }//end of while 
            
            double areaRectangle = length * width; 
            return areaRectangle; 
        }//end of Rectangle 
        
        public static double areaOfTriangle (double base, double height){
            Scanner inputT = new Scanner (System.in);
            System.out.print ("Enter the base of the triangle: ");
            while (true){
                if (inputT.hasNextDouble()){
                    base = inputT.nextDouble();
                    break;
                }
                System.out.print("Invalid input. Please enter an integer: ");
                inputT.next(); 
            }//end of while 
            System.out.print("Enter the height of the triangle: ");
            while (true){
                if (inputT.hasNextDouble()){
                    height = inputT.nextDouble();
                    break;
                }
                System.out.print("Invalid input. Please enter an integer: ");
                inputT.next(); 
            }//end of while 
            double areaTriangle = 0.5*base*height;
            return areaTriangle;
        }//end of Triangle 
        
        public static double areaOfCircle (double radius){
            Scanner inputC = new Scanner (System.in);
            System.out.print("Enter the radius of the circle: ");
            while (true){
                if (inputC.hasNextDouble()){
                    radius = inputC.nextDouble();
                    break;
                }
                System.out.print("Invalid input. Please enter an integer: ");
                inputC.next(); 
            }//end of while 
            double areaCircle = 3.1415926*(radius)*(radius); 
            return areaCircle;
        }//end of circle
    
}//end of class