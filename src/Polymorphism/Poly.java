package Polymorphism;

public class Poly {

	public static void main(String[] args) {
		Poly a=new Poly();
		a.method(1000);
	}
public void method() {
	System.out.println("this is first");
}
public void method(int i) {
	System.out.println("this is second");
}
}
