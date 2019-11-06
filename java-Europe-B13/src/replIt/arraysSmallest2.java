package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class arraysSmallest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();

		 int count=0;
		    String[] arr=str.split(",");
		    
		    System.out.println(Arrays.toString(arr));
		    
		    
		
		int[]length=new int[arr.length];

				for(int i = 0; i < arr.length;  i++) {
				  

				 length[i]=arr[i].length();
				}
		          System.out.println(Arrays.toString(length));

	          Arrays.sort(length);
	          
	          System.out.println(Arrays.toString(length));
	          for (int j=0;j<arr.length-1;j++) {
	         
	        if (length[0]>=arr[j].length()) {
	        	  
	        	
	        	count++;
	          }
		      
	          


	    
	}
	          System.out.println(count);
		        String [] arr2=new String[count];

	      for (int a=0;a<arr.length-1;a++) {
        
       if (length[0]>=arr[a].length()) {
    	       	   
    	   arr2[a]+=arr[a];
    	   
    	   System.out.println(Arrays.toString(arr2));
 
	}}}}
	
