package replIt;

public class findmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int[] x = {33,44,55};
		System.out.println(maxValue(x));
		
		
	}
	public static int maxValue( int[]  n ) {

		int min = Integer.MAX_VALUE;

		for(int each: n)

		if(each < min)

		min = each;

		 

		return min;

		}
}
