package day28_array_Lab;

import java.util.Arrays;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] x={1,3,5,6,7,8};
		int[] y={1,2};
		int[] z={1,0};

		System.out.println(Arrays.toString(doublelenght(x)));
		System.out.println(Arrays.toString(doublelenght(y)));
		System.out.println(Arrays.toString(doublelenght(z)));
		
		
	}

	public static int[] doublelenght(int[] arr) {
		
		
	int []arr1=new int[arr.length*2];
				
				arr1[arr1.length-1]=arr[arr.length-1];
				
			
			return arr1;

		
	}

	
		
		

}