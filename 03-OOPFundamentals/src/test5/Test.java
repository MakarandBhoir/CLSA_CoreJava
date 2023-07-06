package test5;

interface I1{
	public static final int X = 100;
	void meth1();
	public abstract void meth2();
}

class C implements I1{
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
	public void meth3() {
		System.out.println("meth3");
	}
}


public class Test {
	public static void main(String[] args) {
		I1 ref = new C();
		ref.meth1();
		ref.meth2();
//		ref.meth3();
		
		System.out.println("X = "+ref.X);
		System.out.println("X = "+I1.X);
	}
}
