package basicJavaProject;

public class Abb {

	//int i=10;
//	int j=20;
	//static int k=30;
	
	public static void main(String[] args) {
		
		Abb b = new Abb();
		int i = b.Test();
		System.out.println(i);
		//System.out.println(b.i);
		//System.out.println(b.j);
		//System.out.println(k);

	}
public int Test() {
	System.out.println(100);
	return 500;
}
}

