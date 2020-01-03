package replIt;

import java.util.Scanner;

public class Methodswithreturn1countappearance {

	public static int  count_appearance(String[] arr,String t){
		 int counter=0;
		   for (int i =0;i<arr.length-1;i++){
		     
		     
		     if (arr[i].equals(t)){
		       counter++;
		     }
		   

		   } 
		   	   	   return counter;
	}
		
	
	public static void main(String[] args) {
		
		
		String [] arr = {"a","foo","bar","foo","bla"};

		String t ="foo";
		 
		
		    System.out.println(count_appearance(arr,t));
	


	}}