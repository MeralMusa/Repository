package replIt;

import java.util.Arrays;

public class MethodsWithArrays3SwitchElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,4,6,8,4,2,};
		
		System.out.println(do_switch(arr));
		System.out.println(Arrays.toString(arr));
	}
	public static int[] do_switch(int[] i) 
	 {
		int dum=i[0];
		
		
		
		i[0]=i[i.length-1];

		i[i.length-1]=dum;
		
		
		
		
		
		
		
		return i;





		}
}
