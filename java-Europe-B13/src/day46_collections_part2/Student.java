package day46_collections_part2;

//1- implement Comparable interface
//2- override compareTo method

public class Student implements Comparable<Student> {

		private int id;
		private String name;
		
		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}

		//returns an int, acccepts object of certain type
		//returns positive value if first object is greater than second 
		//returns negative value if first object is less than second
		//returns 0 if first object is equals to second
		
		@Override
		public int compareTo(Student anotherStudents) {
			
			if(this.id > anotherStudents.id) {
				return 1;
			}else if(this.id < anotherStudents.id) {
				return -1;
			}else {
				return 0;
			}
		}
}