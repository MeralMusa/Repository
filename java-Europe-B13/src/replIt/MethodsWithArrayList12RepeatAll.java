package replIt;

import java.util.ArrayList;

public class MethodsWithArrayList12RepeatAll {

	public static void main(String[] args){
	
		  ArrayList <Boolean> arr=new ArrayList<Boolean>(5);
		
		  
		  arr.add(true);
		  arr.add(true);
		  arr.add(false);
		  arr.add(false);
		  arr.add(false);
		  
		  
		  repeatAL(arr);
		
		  System.out.println(arr);
		  
	}
	

   public static void repeatAL(ArrayList <Boolean> repeat) {
	
	
	repeat.addAll(repeat);
	   
	
	  
	   
}
   
}