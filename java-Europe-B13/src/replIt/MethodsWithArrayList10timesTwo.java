package replIt;

import java.util.ArrayList;

public class MethodsWithArrayList10timesTwo {

	public static void main(String[] args){
		
		  ArrayList <Integer> nums=new ArrayList<Integer>(7);

		  nums.add(2);
		  nums.add(8);
		  nums.add(3);
		  nums.add(2);
		  nums.add(5);
		  nums.add(2);
		  nums.add(5);	
		  
              timesTwo(nums);
              System.out.println(nums);
	
	}
	public static void timesTwo(ArrayList <Integer> nums ){
	  	  int[]arr=new int[nums.size()];

	  
	  for (int i=0;i<nums.size();i++){
	    
	    
        arr[i]=nums.get(i);
	    arr[i]=arr[i]*2;
	    
	    nums.remove(i);
	    nums.add(i, arr[i]);	    
	    
	    
	  }
	  
	  
	}
	

}
