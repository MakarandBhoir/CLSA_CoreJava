package test4;
class A{
	public A() {
		super();
		System.out.println("A");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("B");
	}
}
class C{
	
}
public class Test1 {

	public static void main(String[] args) {
		B obj = new B();
		
		if(obj instanceof Object)
			System.out.println("obj is object of Object class");
		
		if(obj instanceof A)
			System.out.println("obj is object of A class");
		
		if(obj instanceof Object)
			System.out.println("obj is object of B class");
		
//		if(obj instanceof C)
//			System.out.println("obj is object of C class");
	}

}
