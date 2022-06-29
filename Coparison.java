import java.lang.*;
import java.util.*;
class Coparison
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		//String str=new String();
		String str=sc.nextLine();
		System.out.println("Enter another string");
		String str1=sc.nextLine();
		System.out.println("String comparison"+str==str1);
		System.out.println("tring comparison using \" compareTo method\""+str.compareTo(str1));
		System.out.println("String is Equal"+str1.equals(str));
		System.out.println("String ignore case"+str1.equalsIgnoreCase(str));



	}
}