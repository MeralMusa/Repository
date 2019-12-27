package day43_polymorphism;

public class TestShape {

	public static void main(String[] args) {
		

		Shape shape1 = new Shape();
		shape1.draw();
		
		Shape shape2 = new Circle();
		shape2.draw();
		
		Shape shape3 = new Square();
		shape3.draw();

		
		Shape shape4 = new Triangle();
		shape4.draw();
	}

}