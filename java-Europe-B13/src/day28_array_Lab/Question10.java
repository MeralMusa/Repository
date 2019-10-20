package day28_array_Lab;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x={1,3,2,4,5,2};
		int[] y={2,2};
		int[] z={3,3};

		System.out.println(twotree(x));
		System.out.println(twotree(y));
		System.out.println(twotree(z));
		
		
	}

	public static boolean twotree(int[] arr) {
		
		int counter2=0;
		int counter3=0;
		
		for (int value :arr) {
			
			if ( value==2) {
				
				
				counter2++;
				
				
				
			}else if (value==3) {
				
				counter3++;
			}
			
		}
		if (counter2==2||counter3==2) {
			
			return true;
		}else {
			
			return false;
		}
			
			
			
		
		
		
	}

	
		
		

}