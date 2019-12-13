package day41_Abstraction;

public abstract class Bird extends Animal {

	
	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void eat() {
		System.out.println("Eating");
	}
		
	
	/*
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}
	*/
	
	public abstract void fly();
	
	
	
	
	

}