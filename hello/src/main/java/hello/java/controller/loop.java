package hello.java.controller;

import java.util.Scanner;

public class loop {
	public void wloop()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		while(a<100) {
			System.out.println(a);
			a++;
		}
		
	}
}
