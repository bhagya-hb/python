package SIB;

public class Sib {
	static int i=10;
static {
	System.out.println("this is sib" +i );
	new Sib();
	
}
{
	System.out.println("this is iib " +i);
}
Sib(){
	System.out.println("this is constructor");
}
	public static void main(String[] args) {
		System.out.println("this is main");
		new Sib().method();
		// TODO Auto-generated method stub

	}
public void method() {
	System.out.println("this is method");
}
}
