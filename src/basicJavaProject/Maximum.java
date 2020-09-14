package basicJavaProject;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
Scanner a = new Scanner(System.in);
		System.out.println("enter the no of students in CSE ");
		int b =a.nextInt();
		System.out.println("enter the no of students in ECE ");
		int c = a.nextInt();
				System.out.println("enter the no of students in MECH ");
		int d = a.nextInt();
		
		
		if(b>=c){
			System.out.println("Highest placement is CSE" );

		}
		else if (c>d){
			System.out.println("Highest placement is ECE");
		}
		else {
			System.out.println("Highest placement is MECH");// TODO Auto-generated method stub
		}

	}

}
