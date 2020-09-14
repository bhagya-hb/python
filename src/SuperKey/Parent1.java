package SuperKey;

public class Parent1 {

	public static void main(String[] args) {
		Parent1 p = new Parent1(100);
		p.method();
	}
	Parent1(){
		System.out.println("this is Parent constructor");
	}
	Parent1(int i){
		System.out.println("this is parent Parameterized con");
	}
public void method() {
	System.out.println("this is method");
}
}
