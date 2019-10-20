package day28_array_Lab;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        
		int[] x={1,3,5,7,48};
				
			int []	y= {};
			
			
			System.out.println(Arrays.toString(makeEnds(x,y)));
		
	}

	
	
	
	
	
	public static int[] makeEnds(int[] arr1,int[] arr2) {
		
		
		
		arr2 =new int[2];
		
		arr2[0] =arr1[0];
		
		
		arr2[1]=arr1[arr1.length-1];
				
		return arr2;
	}
}
