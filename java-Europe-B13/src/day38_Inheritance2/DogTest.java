package day38_Inheritance2;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog("yorkie", 1, 1, 8, 20, 2, 4, 1, 20, "Long Sily");
		//dog.eat(); 
		
		dog.run();
		
		dog.move(10);
		
		
		//find the Dog class and run the eat method
		//if eat() does not exist in Dog class - check if there is any is-a relationship
		//if yes -  go to parent and look for eat()
		

		
		
	}

}