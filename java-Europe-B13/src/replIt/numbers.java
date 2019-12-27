package replIt;

import java.util.ArrayList;
import java.util.Arrays;

public class numbers {

	
	
	
	int[] arr = {10,20,7, 8, 90};

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

		}}
