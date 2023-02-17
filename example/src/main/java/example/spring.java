package example;

public class spring {
	int a;
	int b;
	int c;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	

	@Override
	public String toString() {
		return "spring [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public void show() {
		System.out.println("hi");
	}

}
