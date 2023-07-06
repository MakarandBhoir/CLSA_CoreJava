package test1;

import java.io.IOException;

public class Test2 {
	
	public static void meth1() {
		throw new NullPointerException();
	}
	
	public static void meth2() throws IOException{
		throw new IOException();
	}
	
	public static void main(String[] args) {
//		meth1();
		try {
			meth1();
			meth2();
		}
		catch(IOException e) {
			System.out.println("IOException");
		}
		catch(NullPointerException e) {
			System.out.println("NPException");
		}
	}

}
