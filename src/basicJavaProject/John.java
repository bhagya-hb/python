package basicJavaProject;

import java.util.Scanner;

public class John {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String b =a.next();
		System.out.println("enter your age: ");
		int c = a.nextInt();
		System.out.println("Enter gender: ");
		String d =a.next();
		System.out.println("Hailing from: ");
		String e =a.next();
		System.out.println("Welcom," +b);
		System.out.println("age: " +c);
		System.out.println("Gender " +d);
		System.out.println("City: "+e);
		
		// TODO Auto-generated method stub

	}

}
