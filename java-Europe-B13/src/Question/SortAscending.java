package Question;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,5,3,2,8,6,2,8,5,};
		Sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static int[] Sort(int[] a) {

		ArrayList<Integer> list=new ArrayList<Integer>();

		for(int each: a)

		list.add(each);

		 

		for(int i=0; i < a.length; i++) {

		a[i] = findMin(list);

		list.remove(Integer.valueOf(a[i]));

		}

		return a;

		}
	private static int findMin(ArrayList<Integer> list) {
		int min =Integer.MAX_VALUE;

		for(int each: list)

		min = Math.min(min, each);

		return min;

		
	
	}
}
