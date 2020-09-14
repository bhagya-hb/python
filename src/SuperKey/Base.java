package SuperKey;

public class Base extends Parent1 {

	public static void main(String[] args) {
	Base b = new Base(100);
	b.method1();
	}
	Base(){
		System.out.println("this is Base con");
	}
	Base(int i){
		System.out.println("this is base par con");
	}
	public void method1() {
		super.method();
		System.out.println("this is base method");
	}

}
