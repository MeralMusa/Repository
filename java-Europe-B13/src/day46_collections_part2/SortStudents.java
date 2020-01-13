
package day46_collections_part2;

import java.util.*;

public class SortStudents {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>(); //holding objects - student objects
		l1.add(10);
		l1.add(20);
		l1.add(50);
		l1.add(1);
		l1.add(5);
		l1.add(100);
		
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
		
		List<Student> stList = new ArrayList<>(); 
		stList.add(new Student(300,"Mike"));
		stList.add(new Student(87,"Smith"));
		stList.add(new Student(1,"Tom"));
		stList.add(new Student(10,"Jimmy"));
		stList.add(new Student(101,"Eddy"));
		
		System.out.println(stList.toString());
		
		Collections.sort(stList);
		
		System.out.println(stList.toString());
		
		String s1 = "w";
		String s2 = "a";
		System.out.println(s1.compareTo(s2));
		
		

	}

}