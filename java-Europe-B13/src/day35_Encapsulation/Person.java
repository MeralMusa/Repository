package day35_Encapsulation;

public class Person {

	private String name;
	private int age;
	public char gender;
	
	
	
	


	public Person(String name, int age, char gender) {
		setAge(age);
		setName(name);
		this.gender = gender;
	}


	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		//condition
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	

	

}