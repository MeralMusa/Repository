package day43_polymorphism;

public class InstanceOf {
	
	public static void main(String[] args) {
		
		Shape shape  = new Circle();
		
		if(shape instanceof Triangle) {
			System.out.println("Triangle");
		}else if(shape instanceof Circle) {
			System.out.println("Circle");
		}else if(shape instanceof Square) {
			System.out.println("Square");
		}
		
	
		
		
	}

}