package method;

public class MethodRules2 {
	public static void main(String[]args) {
		MethodRules2 b = new MethodRules2();
		b.TestMethod2();
		b.TestMethod();
		System.out.println("Main Method");
	}
public void TestMethod() {
	System.out.println("Test Method");
	//MethodRules2 obj2= new MethodRules2();
	//obj2.TestMethod2();
}
public void TestMethod2() {
	System.out.println("Test Method2");
}
}
