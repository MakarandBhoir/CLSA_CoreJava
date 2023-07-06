package test6;

interface I1{
	default void meth1() {
		System.out.println("default method");
	}
	static void meth2() {
		System.out.println("static method");
	}
	private void meth3() {
		System.out.println("private method");
	}
}

public class Test {
	public static void main(String[] args) {

	}
}
