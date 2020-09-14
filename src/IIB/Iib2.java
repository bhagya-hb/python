package IIB;

public class Iib2 {
	Iib2(){
		System.out.println("this is constructor");
	}
	{
		System.out.println("this is iib");
	
	}
	static{
		System.out.println("this is Sib");
	}
	public static void main(String[] args) {
		System.out.println("thi is main");
	     new Iib2().method();	    
	method2();
	}
	public void method() {
		System.out.println("this is method");
	}
	public static void method2() {
		System.out.println("this is method2");
	}
}
