package day28_array_Lab;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] x= {1,2,3};
		int[] y= {-4,2,0};
		
		System.out.println( sum(y));
		System.out.println( sum(x));
 		
	}

	
	
	public static int sum(int[] arr) {
		
		
		
		int sum =0;
		
		for(int value  :arr) {
			
			sum=sum+value;
			
			
		}return sum;
				
	
	
	}
	}
