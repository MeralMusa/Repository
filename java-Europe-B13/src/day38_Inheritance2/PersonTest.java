package day38_Inheritance2;

public class PersonTest {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.display();
		
		

	}

}


class Person{
	
	public void message() {
		System.out.println("This is person class");
	}
}

class Student extends Person{
	
	@Override
	public void message() {
		System.out.println("This is student class");
	}
	
	public void display() {
		message();
		super.message();
	}
}
