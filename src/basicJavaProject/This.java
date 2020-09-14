package basicJavaProject;

public class This {
int i =10;
	public static void main(String[] args) {
System.out.println("this is main");
This a = new This();
System.out.println(a.i);
System.out.println(a);
a.method2();
	}
public void method() {
	System.out.println(this);
	System.out.println(i);
}
public void method2() {
	This b = new This();
	b.method();
	System.out.println(b);	
}
}
