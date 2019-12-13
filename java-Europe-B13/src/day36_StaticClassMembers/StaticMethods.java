package day36_StaticClassMembers;

public class StaticMethods {

	
	
static String name = "Apple";
	
	public static void show1() {
		System.out.println("Hi");
		//show2(); //u can not call instance method/variable from static method 
		show4(); //u can call static method from static method
		System.out.println(name);
	}
	
	public void show2() {
		System.out.println("Hi");
		show1(); //u can call static from instance method
		System.out.println(name);
		
	}
	
	public void show3() {
		System.out.println("Hi");
		show2(); //u can call instance method from instance method
		show1(); //u can call static from instance 
	}
	
	public static void show4() {
		System.out.println("Hi");
	}

}
