package collection.inheritance;

public class Cinheritance {
	/*
	 * int a; String name; int sal; Cinheritance1 tot; Cinheritance(int a, String
	 * name, int sal){ this.a = a; this.name = name; this.sal = sal; }
	 * Cinheritance(int a, Cinheritance1 tot){ this.a=a; this.tot=tot; } void
	 * print(){ System.out.println(a); System.out.println(name);
	 * System.out.println(sal); System.out.println(tot); }
	 */
	private int id;  
	private String name;  
	private Cinheritance1 address;  
	public Cinheritance() {}  
	  
	public Cinheritance(int id, String name) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	}  
	public Cinheritance(int id, String name, Cinheritance1 address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}  
	  
	}

