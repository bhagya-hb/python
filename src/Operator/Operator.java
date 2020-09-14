package Operator;

import java.util.Scanner;

public class Operator {
			  public static void main(String[] args) {
				  Scanner a = new Scanner(System.in);
				  System.out.println("enter the no of pizzas bought ");
				  int b = a.nextInt();
				  System.out.println("enter the no of puffs bought ");
				  int c = a.nextInt();
				  System.out.println("enter the no of cool drinks bought ");
				  int d = a.nextInt();
				System.out.println("no of pizzas " +b);
				System.out.println("no of puffs " +c);
				System.out.println("no of cool drinks " +d);
				System.out.println("total price " +(b*100+c*20+d*10));
			  }
			}

