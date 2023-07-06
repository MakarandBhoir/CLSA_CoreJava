package test7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class A{
	void meth1(int x) {
		
	}
	protected void meth2() {
		
	}
	Object meth3() {
		return null;
	}
	void meth4() throws IOException {
		
	}
}
class B extends A{
	@Override
	void meth1(int a) {
		
	}
	@Override
	public void meth2() {
		
	}
	@Override
	public A meth3() {
		return null;
	}
	@Override
	public void meth4() throws IOException{
		
	}
}
public class Test {
	public static void main(String[] args) {

	}
}
