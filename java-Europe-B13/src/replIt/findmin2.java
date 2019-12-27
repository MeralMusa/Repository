package replIt;

import java.util.Arrays;

public class findmin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {33,44,55};
		System.out.println(minValue(x));
	}
	public static int minValue( int[]  n ) {

		Arrays.sort( n );

		return  n [ 0 ];

		}
}
