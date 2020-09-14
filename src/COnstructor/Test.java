package COnstructor; 

public class Test{
Test(){
	System.out.println("defualt constructor");
}
Test(int i){
	this();
	System.out.println(i);
}

    public static void main(String[] args){
    Test a = new Test(10);
    a.method();
    }
    private void method() {
    	System.out.println("method");
    }
}