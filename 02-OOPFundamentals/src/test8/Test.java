package test8;

import java.io.*;

class Test {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("hello.txt")) 
		{
			String text = "Learning Try with resource.";
			byte arr[] = text.getBytes();
			fos.write(arr);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Resource are closed and message has been written to file");
	}
}
