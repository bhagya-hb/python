package IIB;

public class Iib {
	static int i;
	int j;
	
	{
		i=10;
		j=20;
		System.out.println("this is iib " +i);
		System.out.println("this is lib0 " +j);
	}
	Iib(){
		System.out.println("this is Constructor");
	}
	public static void main(String[] args) {
		System.out.println("main");
		new Iib().method();
		// TODO Auto-generated method stub
		}
public void method() {
	System.out.println("this is method");
}
}
