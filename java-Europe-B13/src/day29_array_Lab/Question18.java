package day29_array_Lab;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int[] x= {1,2,3};
		int[] y= {-4,2,0,13};
		
		System.out.println( sum(y));
		System.out.println( sum(x));
 		
	}

	
	
	public static int sum(int[] arr) {
		
		
		
		int sum =0;
		
	for(int i =0;i<arr.length;i++) {

		if (arr[i]!=13) {
			
			sum=arr[i]+sum;
		}else {
			
			break;
		}
		
			
			
		}return sum;
				
	
	
	
	

		
	}

}
