package replIt;

import java.util.Scanner;

public class Methods14Printuniquenumbers {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i=0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    printUniqueNumbers(nums);
	  }
	  
	  public static void printUniqueNumbers(int[] nums){
	    int dummy=0;
	  for (int i=0;i<nums.length;i++){
          int count=0;

	           dummy=nums[i];
	           for (int j=0;j<nums.length;j++){

	             if (dummy==nums[j]&&i!=j){
	               count++;
	               
	               }
	             
	               
	               }
	           if (count==0){
	                 System.out.println(dummy);
	                 }
	           count=0;
	  }
	  
	  
	  }
	}