package practice1;

public class simplearray {
		public static void main(String[] args) {
			int arr[] = {23,34,45,56};
			int arr1[] = new int[4];
			simplearray simplearray = new simplearray();
//			int[] s = simplearray.sum(arr);
//			for(int i=0;i<s.length;i++) {
//				System.out.println(s[i]);
//			}
			int n = simplearray.sum(arr);
			System.out.println(n);
			System.out.println(arr1.getClass().getSuperclass());
			
		}
		int sum(int[] i) {
			return i[0];
			
		}
}
