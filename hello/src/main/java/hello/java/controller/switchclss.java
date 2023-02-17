package hello.java.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class switchclss {
	public void tree() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int a = sc.nextInt();
	switch(a) {
	case 1:System.out.println("hi");
	  		break;
	case 2:System.out.println("hello");
	 		break;
	default:System.out.println("bye");
	 		break;
	}
	
	}
	public void list(ArrayList a) {
		//ArrayList<String> ss = new ArrayList<String>(40);
		/*
		 * ss.add("67"); ss.add("68"); ss.add("69"); ss.add("60");
		 */
		Iterator itr =a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
	
}
