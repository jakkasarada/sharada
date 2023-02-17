package hello.java.controller;

import java.util.Scanner;

public class Sample1 {
	public static void print() {
		for(int i=1;i<10;i++) {
			System.out.println(i+"\t");
		}
		}
	public static int mul(int a,int b ) {
		int c = a*b;
		System.out.println(c);
		return c;
	}
	public static void even(int x) {
		for(int i=2;i<=x;i+=2) {
			System.out.println(i);
		}
	}
	

}
