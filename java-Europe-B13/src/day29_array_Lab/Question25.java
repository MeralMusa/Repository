package day29_array_Lab;
import java.util.*;
public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
		int[] x= {2,10,3,4,5,20,4};
		
		
		System.out.println(Arrays.toString(tenRun(x)));
		
	}
		
		
		public static int[] tenRun(int[] arr) {
			
			  for(int i = 0; i < arr.length;i++){
			
			  if ( arr[i] % 10 == 0){
			
			  for (int j = i +1; j < arr.length && !(arr[j] % 10 == 0) ; j++) {
				  
				  arr[j] = arr[i];
			  
			  }}}
			
			  return arr;
			
			}
	}
