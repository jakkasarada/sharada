package hello.java.controller;

public class operation {
	public add add1;
	public operation(add add) {
		this.add1=add;
	}
	public int addition1(int x,int y) {
		int add2 = add1.addition(x, y);
		System.out.println(add2);
		return add2;
	}
}
