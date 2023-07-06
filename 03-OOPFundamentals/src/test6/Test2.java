package test6;

@FunctionalInterface
interface I2{
	void meth1();
	//void meth2();
}
//1. Create a class
//2. Implement interface
//3. Override method
//4. write a body
//5. call a method


public class Test2 {
	public static void main(String[] args) {
//		I2 ref = new I2() {
//			public void meth1() {
//				System.out.println("meth1");
//			}
//		};
//		
//		ref.meth1();
		
		I2 ref2 = () -> System.out.println("meth1 using Lambda Expression.");
		
		ref2.meth1();
	}
}




