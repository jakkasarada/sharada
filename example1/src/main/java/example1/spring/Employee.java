package example1.spring;

public class Employee {
	 int name;
	String fname;
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", fname=" + fname + "]";
	}
	/*
	 * public void a() { System.out.println("values:"+name);
	 * System.out.println("values:"+fname); }
	 */

}
