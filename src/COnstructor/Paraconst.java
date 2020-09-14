


package COnstructor;

public class Paraconst {
	Paraconst(){
		System.out.println("this is a constructor");
	new Paraconst();
	}
	
Paraconst(int i){
	System.out.println("this is second constructor" +i);
		new Paraconst();
	}

	public static void main(String[] args) {
Paraconst b = new Paraconst();
Paraconst b1 = new Paraconst(100);
b.Test();

	}
public void Test() {
	System.out.println("this is test");
}
}