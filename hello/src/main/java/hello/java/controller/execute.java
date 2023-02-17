package hello.java.controller;

public class execute implements looping {

	@Override
	public void floop() {
		for(int i=0;i<4;i++) {
			System.out.println(i);
		}
		
	}

	@Override
	public void wloop() {
		int j=0;
		while(j<9) {
			System.out.println(j);
			j++;
		}
		
	}

}
