package day29_array_Lab;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []x= {2,1,2,3,4};
		
		System.out.println(primeNumber(x));
		
		
		
	}

	
	public static int primeNumber(int []arr) {
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0) {
				
				
				counter++;
			}
			
		
		
		}
		return counter;
	}

}
