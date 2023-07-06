package test3;

class A{
	protected void meth1() {
		System.out.println("A: meth1");
	}
	static void meth2() {
		System.out.println("static A: meth2");
	}
}
class B extends A{
	//@Override
	public void meth1() {
		System.out.println("B: meth1");
	}
	
	static void meth2() {
		System.out.println("static B: meth2");
	}
}
class C extends A{
	//@Override
	protected void meth1() {
		System.out.println("C: meth1");
	}
}
public class Test {
	public static void main(String[] args) {
		A obj = new A();
		obj.meth1();
		
		A ref = null;
		ref = new B();
		ref.meth1();
		ref.meth2();
	}
}
