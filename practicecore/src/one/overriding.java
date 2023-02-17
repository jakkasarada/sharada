package one;
class A
{
	A print() {
		System.out.println("hi");
		return this;
	}
	A show() {
		System.out.println("hello");
		return this;
	}
}
class B extends A{
	A print() {
		System.out.println("sharada");
		return this;
	}
	B show() {
		System.out.println("jagadeesh");
		return this;
	}
}
public class overriding {
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		b.print().show();
		a.show().print();
	}

}
