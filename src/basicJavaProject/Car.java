package basicJavaProject;

import java.util.Scanner;

public class Car {
public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	System.out.println("Enter the car name: ");
	String b = a.next();
	System.out.println("enter the car no.: ");
	int c = a.nextInt();
	System.out.println("enter the Price: ");
	double d = a.nextDouble();
	System.out.println("car name: \n" +b );
	System.out.println("car no.: \n" +c);
	System.out.println("car price: \n" +d);
}
}
