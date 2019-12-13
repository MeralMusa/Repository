package day39_finalKeyword;

import day27_array_part4.Teams;

public class FinalArrays {

	public static void main(String[] args) {
		
		final int[] TEAMS = {11,11};
		System.out.println(TEAMS[0]);
		System.out.println(TEAMS[1]);
		
		TEAMS[0]=10;
		TEAMS[1]=9;
		
		System.out.println(TEAMS[0]);
		System.out.println(TEAMS[1]);
		
		int[] nums = new int[] {23,55,3535};
		nums = new int[] {23,55,3535,42};
		
		final int[] finalNums = {23,66,44,12};
		finalNums[0]=120;
		finalNums[1]=200;
		//finalNums = new int[] {1,2,3,4};
		
	
		
		
		
		

	}

}
