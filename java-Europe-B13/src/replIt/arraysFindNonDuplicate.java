package replIt;

import java.util.Scanner;

public class arraysFindNonDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
//		Given an array nums with 7 integers every element 
//		is repeated twice - except one. Find that element and print it to console.
		
		  Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		
		    boolean [] compare = new boolean[nums.length];
	        for (int i = 0; i <nums.length ; i++) {
	            int x = nums[i];
	            if(compare[i]==false) {
	                boolean Duplicate = false;
	                for (int j = i + 1; j < nums.length; j++) {
	                    if (x == nums[j]) {
	                        Duplicate = true;
	                        compare[j] = true;
	                    }
	                }
	                if (!Duplicate)
	                    System.out.println("Element appear only once in array - " + x);
	            }
	        }
	    }
	}

