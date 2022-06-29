import java.lang.*;
import java.util.*;
class Substring
{
	public static void main(String args[])
	{
		//String str=new String("shaada");
		//str.append("jaggu");
	StringBuilder str=new StringBuilder("sharada");
	System.out.println("insert operation"+str.insert(1,"subbu"));
	System.out.println("original string::::::::::"+str);
	//StringBuilder x=str.append("jaggu");	
	System.out.println("aftr appending:::::::::::"+str.append("jaggu").toString());
	System.out.println("sub string::::"+str.substring(2));
	System.out.println("sub string::::"+str.substring(0,3));
	//String[] a=str.split("\\.");
	//System.out.println(Arrays.toString(a));
	System.out.println("Reverse of string:::::::"+str.reverse());
	System.out.println("Replace of string::::::::\n"+str.replace(0,9,"java"));
	System.out.println("Deleting thestring;;;::"+str.delete(1,3));
	System.out.println("capacity::::"+str.capacity());
	}
}