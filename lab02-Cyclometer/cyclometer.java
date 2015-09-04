// Zhenyu Li 
// 9/4/2015
// lab02
//Cyclometer Java Program 
// recojavards time and rotation counts 
// print the number of minutes for each trip
// print the number of counts for each tirp
// print the distance of each trip in miles
// print the distance for the two trips combined


public class cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    //input data 
   	    int secsTrip1=480;  // time for the first trip 
       	int secsTrip2=3220;  // time for the second trip 
		int countsTrip1=1561;  // the total ratation counts for the first trip 
		int countsTrip2=9037; // the total ratation counts for the second trip 
		
		//useful constants
		double wheelDiameter=27.0,  // diameter of the wheel 
  	    PI=3.14159, // pi 
  	    feetPerMile=5280,  // feet to miles convention 
  	    inchesPerFoot=12,   // inches to feet convention 
  	    secondsPerMinute=60;  // second to minute convention 
	    double distanceTrip1, distanceTrip2, totalDistance;  // output data 
	    
	    //print out the numbers  
		System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
	    
	    //calculation 
	    // calculate each trip seperately and then add them together 
	    distanceTrip1=countsTrip1*wheelDiameter*PI;//distance1 in inches
    	//the diameter in inches times PI)
	    distanceTrip1/=inchesPerFoot*feetPerMile; // distance1 in miles 
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;// distance2 in miles 
	    totalDistance=distanceTrip1+distanceTrip2; //the total distance 
	    
	    //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    	System.out.println("The total distance was "+totalDistance+" miles");



	}  //end of main method   
} //end of class
