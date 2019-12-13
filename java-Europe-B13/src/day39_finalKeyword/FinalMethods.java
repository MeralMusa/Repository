package day39_finalKeyword;

public class FinalMethods {
	
	public final void method1() {
		System.out.println("Method-1");
	}
	
	public final static void staticMethod(String word) {
		System.out.println("Static Method");
	}

}

class Sub extends FinalMethods{
	
	/*
	@Override
	public void method1() {
		System.out.println("Method-1 in sub class");
	}
	*/
	
	
	
	/*
	public static void staticMethod(String word) {
		System.out.println("Static method in sub class");
	}
	*/
	

	
	
}