import java.lang.*;
class Concat
{
	public static void main(String args[])
	{
		String sn=20+20+"jaggu"+20;
		String sm="sharada";
		System.out.println(sn);
		System.out.println(sn.concat(sm));
		StringBuilder s=new StringBuilder(sm);
		StringBuilder s1=new StringBuilder("jaggu");
		//StringBuilder s2=s.append(s1);
		System.out.println(s.append(s1).toString());
		System.out.println(s.reverse());
	}
}
