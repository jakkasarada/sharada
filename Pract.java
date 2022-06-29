import java.io.*;
import java.util.*;
import java.lang.*;
class Pract
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		System.out.println(str);
		System.out.println("string length::"+str.length());
		System.out.println("string trimming::"+str.trim());
		System.out.println("upper case::"+str.toUpperCase());
		System.out.println("lower case::"+str.toLowerCase());
		System.out.println("starts with::"+str.startsWith("a"));
		System.out.println("starts with::"+str.endsWith("a"));
		System.out.println("chatAt::"+str.charAt(6));
		System.out.println("replacement :"+str.replace("java","jagadeesh"));
		String s1 =  str.intern();
		System.out.println(s1);
		System.out.println("values of"+String.valueOf(s1));
	}
}