package day33_ClassesPbjects_Constructures;

public class Student {

	String name;
	int age;
	char gender;
	int year;
	String course;
	String university;
	
	public Student(String name, int age, char gender, int year, String course, String university) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		this.university = university;
	}
	
	public Student() {
		
	}
	
	public void attendLecture() {
		System.out.println(name + " is attending lecture");
	}
	
	public void submitAssignment() {
		System.out.println(name  + " is submitting assignment");
	}
	
	public void attendLab() {
		System.out.println(name + " is attending lab");
	}
	
	
	

}