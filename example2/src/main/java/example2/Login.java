package example2;

public class Login {
	int a;
	int b;
	int c;
	String name="sharada";
	public Login() {
//		super();
		System.out.println("this is constructure");
	
	}
	public Login(int a, int b, int c) {
		super();
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+b+c);
	}
	public int add(int a, int b) {
		System.out.println("addition of a&b is");
		return a+b;
	}
	

}
