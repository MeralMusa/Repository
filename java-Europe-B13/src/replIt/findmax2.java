package replIt;

import java.util.Arrays;

public class findmax2 {

	public static void main(String[] args) {
		
		
		
		int[] x = {33,44,55};
		System.out.println(maxValue(x));		
		// TODO Auto-generated method stub

	}
	
	
	public static int maxValue( int[]  n ) {

		Arrays.sort( n );

		return  n [ n.length-1 ];

		}
}
