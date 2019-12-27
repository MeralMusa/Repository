package day44_exceptions;

public class RuntimeError {

	public static void main(String[] args) {
		
		go();

	}
	
	public static void go() {
		System.out.println("Going");
		go();
	}

}