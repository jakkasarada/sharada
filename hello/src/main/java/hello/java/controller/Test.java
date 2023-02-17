package hello.java.controller;

import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sharada");
		System.out.println("from kadapa");
		System.out.println("AP");
	
		int age=Integer.parseInt(args[0]);
		if(age>50)
		{
			System.out.println("your too younger");
		}
		
	}
	
	public static int getAgeMultiple(int age) {
		return age*age;
	}

}
