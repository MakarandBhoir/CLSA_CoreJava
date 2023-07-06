package test3;
class X{
	static void meth1() {
		System.out.println("static X:meth1");
	}
}
class Y extends X{
	static void meth1() {
		System.out.println("static X:meth1");
	}
}

public class Test2 {
	public static void main(String[] args) {
		X obj = new Y();
		obj.meth1();
		
		
	}
}
