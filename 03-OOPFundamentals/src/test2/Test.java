package test2;

abstract class A{
	abstract protected void meth1();
}

class B extends A{
	@Override
	public void meth1() {
		
	}
}

abstract class C extends A{
	
}
class D extends C{
	@Override
	public void meth1() {
		
	}
}
public class Test {
	public static void main(String[] args) {
		//A obj = new A();
	}
}
