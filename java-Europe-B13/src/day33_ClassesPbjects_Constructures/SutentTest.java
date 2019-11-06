package day33_ClassesPbjects_Constructures;

public class SutentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s1 = new Student("Mike", 19, 'M', 2017, "Java", "Cybertek");
		Student s2 = new Student("Smith", 25, 'M', 1999, "TS", "Cybertek");
		
		s1.attendLecture();
		s2.attendLab();
		
		
		
	}

}
