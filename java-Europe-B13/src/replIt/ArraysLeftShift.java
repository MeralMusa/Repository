package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    
	    for(int i = 0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    //WRITE YOUR CODE HERE
	    	    shift(nums);
	    	    
	    	    System.out.println(Arrays.toString(nums));

	

	   
	    
	  }

	private static void shift(int[] nums) {
		// TODO Auto-generated method stub
		  int storeindex=nums[0]; // Store first index

	        int left=1;
	        for(;left<nums.length;left++){
	            nums[left-1]=nums[left];
	}
	        nums[left-1]=storeindex;
	}}