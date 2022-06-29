import java.util.*;
class Arraylist
{
	public static void main(String args[])
	{
		ArrayList<Integer> a=new ArrayList<Integer>();//creating arraylist
		for(int i=0;i<=10;i++)// adding elements to an array
			a.add(i);
		//for(int i=0;i<10;i++)
		//	System.out.println(i);//printing array elements
		a.remove(5);
		for(int i=0;i<=10;i++)
			System.out.println(i);
	}
}