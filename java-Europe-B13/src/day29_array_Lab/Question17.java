package day29_array_Lab;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] x = {7,2,10,9};
		
		System.out.println(difference(x));

	}
	
	public static int difference(int[] arr) {
		
		//finding the biggest
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
			}
		}
		
		//finding the smallest
		int min = max;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				
				min = arr[i];
			}
		}
		
		return max-min;
	}}
