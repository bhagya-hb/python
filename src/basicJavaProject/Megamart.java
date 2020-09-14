package basicJavaProject;

import java.util.Scanner;

public class Megamart {

	public static void main(String[] args) {
		float percantage;
		Scanner a = new Scanner(System.in);
		System.out.println("enter thr Customer id: ");
		int b =a.nextInt();
		if(b<0) {
			System.out.println("it not a valid customer id");
		return;
		}
		
		System.out.println("Enter the bill amount: ");
		double c=a.nextDouble();
		if(c<0) {
			System.out.println("it is not valid bill amount");
		return;
		}

		
		if(b<=100) {
			percantage = (float)(c-c/15);
			System.out.println("Bronze " + percantage);
		// TODO Auto-generated method stub
		}
		else if(b<=250) {
			System.out.println("Silver " +(c-c/18));
		}
		else if(b<=500) {
			System.out.println("gold " +(c-c/23));
		}
		else if(b<=1000) {
			System.out.println("Platinum " +(c-c/28));
		}
		else if(b>1000) {
			System.out.println("Diamond " +(c-c/32));
		}
		
	}

}
