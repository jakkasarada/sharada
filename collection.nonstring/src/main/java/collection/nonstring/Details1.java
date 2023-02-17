package collection.nonstring;

import java.util.List;

public class Details1 {
	int no;
	List<String> book;
	Details1(int no, List<String> book){
		this.no=no;
		this.book=book;
	}
	@Override
	public String toString() {
		return "[no=" + no + ", book=" + book + "]";
	}
	

}
