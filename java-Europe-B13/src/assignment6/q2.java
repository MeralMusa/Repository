package assignment6;

public class q2 {

	public static void main(String[] args) {
		// Question 2:
//		Write a Java program to store numbers 1 to 10 in an array using data instantiation.
//		Then write a for loop to multiply each member of above array by 19, this way you will get table of 19 stored in the above array.
//		Finally write another for loop to print all the array elements.
//		You should get following output:
		
		
		
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length;i++) {
			
			
			arr[i]*=19;
			for(int j=0;j<1;j++) {
			System.out.println(arr[i]);
		}
			
		}
		
		
	}

}
