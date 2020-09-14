package basicJavaProject;

import java.util.Scanner;

public class Escanner {

	public static void main(String[] args) {
	System.out.println("student information");
		Scanner a =new Scanner(System.in);
		System.out.println("enter name: ");
		String b =a.nextLine(); 
		System.out.println("enter age: ");
		int c = a.nextInt();
		a.nextLine();
		System.out.println("enter address: ");
		String d = a.nextLine();
		// TODO Auto-generated method stub
System.out.println("name " +b);
System.out.println("age " +c);
System.out.println("adress \n" + d);
	}

}
