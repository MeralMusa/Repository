package day43_polymorphism;

import java.util.ArrayList;


import java.util.List;

public class ShapesArray {

	public static void main(String[] args) {
		
		
	

		Shape[] shapes = new Shape[3];  
		
		shapes[0] = new Triangle();
		shapes[1] = new Square();
		shapes[2] = new Circle();
		
		
		
		
		
		
		for(Shape sh : shapes ) {
			System.out.println(sh.getClass().getName());
			//sh.draw(); 
		}
		
		
		
		
		
		
		List<Shape> shapeList = new ArrayList<>(); 
		
		
		shapeList.add(new Triangle());
		shapeList.add(new Circle());
		
		

	}

}