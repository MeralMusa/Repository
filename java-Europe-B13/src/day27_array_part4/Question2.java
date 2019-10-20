package day27_array_part4;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int[] x = {1,2,3};
		int[] y = {1,2,3,1};
		int[] z = {1,2,1};
		int[] k = {1};
		
		//calling the method
		System.out.println(samFirstLast(x));
		System.out.println(samFirstLast(y));
		System.out.println(samFirstLast(z));
		System.out.println(samFirstLast(k));
		
	
	
	
	
	}public static String samFirstLast(int[] arr) {
		
		if(!(arr.length>1)) {

			return "Not valid an array";	
}
		
		if(arr[0]== arr[arr.length-1]) {
			return "true";
		}else {
			return "false";
		}
	}	
		
		
		
	}


