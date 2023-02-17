package collection.nonstring;

import java.util.Iterator;
import java.util.List;

public class Details {
	int number;
	List<String> names;
	int phno;
	List<Details1> details;
	Details(int number, List<String> names, int phno, List<Details1> details){
		this.number=number;
		this.names=names;
		this.details=details;
		this.phno=phno;
		
	}
	public void print()
	{
		System.out.println("id number is:::"+number);
		System.out.println("phone number is::"+phno);
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator<Details1> itr1=details.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
