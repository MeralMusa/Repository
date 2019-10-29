package assignment6;

import java.util.*;

public class q3 {

	public static void main(String[] args) {
		// Question 3:
//		Below is One-dimensional array code:
//			char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
//
//			Write the code to search for particular character in above array.
//			If I search for 'B', then output should be: "B found!"
//			If I search for 'E', then output should be: "E Not found!"
//
//			 
		Scanner sc=new Scanner(System.in);

		char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
		
		
		String s=sc.next();
		
		
		for (int i=0;i<arr.length-1;i++) {
			
			
			if (Arrays.toString(arr).contains(s)) {
			
				
				System.out.println(s+ " found!");
				break;
				
			}else {
				
				System.out.println(s+ " Not found!");
				break;
				
			}
		
		}
	}

}
