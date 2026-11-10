package tp4.exo1;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
    	int numberOfPoints;
    	
    	Scanner sc = new Scanner(System.in);
    	do {
    		System.out.println("How many points do you wanna create ? ");
    		numberOfPoints = sc.nextInt();
    		if(numberOfPoints <= 0 )
        		System.out.println("Enter a positive number ");
    	}while(numberOfPoints <= 0 );
    	
        Point[] arrPoints = new Point[numberOfPoints];
        
		System.out.println("========= Filling Data =========");
	    for (int i = 0; i < numberOfPoints ; i++) {
	    	   arrPoints[i] = new Point();
	       System.out.println("------ Point #"+ (i+1) + " : ");
	       System.out.println("Enter a name : ");
	       arrPoints[i].setName(sc.next());
	       System.out.println("Enter the cordinate X : ");
	       arrPoints[i].setX(sc.nextDouble());
	       System.out.println("Enter the cordinate Y : ");
	       arrPoints[i].setY(sc.nextDouble());
	    }
	       
        for (int i = 0; i < Point.getIdentMax() ; i++) {
            System.out.println("ID: " + arrPoints[i].getIdent() + " | Name : " + arrPoints[i].getName() + " | Coordinates: (" + arrPoints[i].getX() + ", " + arrPoints[i].getY() + ")");
        }
        
        sc.close();
    }
}