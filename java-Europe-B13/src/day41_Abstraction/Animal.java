package day41_Abstraction;

public abstract class Animal {
	
	 String name;
	
	public Animal(String name) {
		this.name=name;
	}
	
	public abstract void eat();
	
	public abstract void breathe();
	
	public void move() {  //instance method
		
		System.out.println("Moving");
	}

}