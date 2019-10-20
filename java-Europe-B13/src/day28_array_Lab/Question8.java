package day28_array_Lab;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] x={1,3};
		int[] y={1,2};
		int[] z={1,0};

		System.out.println(twotree(x));
		System.out.println(twotree(y));
		System.out.println(twotree(z));
		
		
	}

	public static boolean twotree(int[] arr) {
		
		
		
		for (int value :arr) {
			
			if (value==2||value==3) {
				
				
				return true;
				
			}
			
		}return false;
			
			
			
		
		
		
	}

	
		
		

}