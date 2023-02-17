package one;
class One{
	int a = 34;
	void print() {
		System.out.println("hi");
	}
}

class Two extends One {
	void show() {
		System.out.println(super.a);
		super.print();
	}
}
public class Superexamplen{
	public static void main(String[] args) {
		Two b = new Two();
		b.show();
//		b.print();
	}
}