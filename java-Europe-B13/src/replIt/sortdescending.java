package replIt;

import java.util.ArrayList;
import java.util.Arrays;

public class sortdescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 int[] arr = {10,20,7, 8, 90};
		 
		System.out.println(Arrays.toString(Sort(arr)));
		 

	}
	public static int[] Sort(int[] a) {

		ArrayList<Integer> list=new ArrayList<Integer>();

		for(int each: a)

		list.add(each);

		 

		for(int i=0; i < a.length; i++) {

		a[i] = findMax(list);

		list.remove(Integer.valueOf(a[i]));

		}

		return a;

		}

		 

		public static int findMax(ArrayList<Integer> a) {

		int max=Integer.MIN_VALUE;

		for(int each: a)

		max = Math.max(max, each);

		return max;

		}
}
