package replIt;

public class findmax {
	public static void main(String[] args) {

	int[] x = {33,44,55,34};
	System.out.println(maxValue(x));
	}
	
	public static int maxValue( int[]  n ) {

		int max = Integer.MIN_VALUE;

		for(int each: n)

		if(each > max)

		max = each;

		 

		return max;

		}
	

	
	
	
	}

