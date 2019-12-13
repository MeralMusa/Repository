package day38_Inheritance2;


public class VehicleTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.display();

	}

}

class Vehicle{
	
	int maxSpeed = 120;
	
}

class Car extends Vehicle{
	
	int maxSpeed = 180; //override the parent variable
	
	void display() {
		System.out.println("Maximum speed:" + super.maxSpeed);  //super - > go to prent class and look for what ever u need overthere
		System.out.println("Maximum speed:" + maxSpeed);
	}
}