package replIt;

import java.util.Scanner;

public class MethodsWithString7At3rdChar {

	  public static String at3(String target,String word)
	  {
		    
	      String dum="";
			  
			  for (int i =0;i<target.length();i++) {
				  
				  if(i==3) {
						 
						 dum+=word;
					 }
				  
				 dum+=target.charAt(i);
		
				  
			  }
				  
			  
			  System.out.println(target.length());
			  
			  
			  
			return dum;
		    
	    
	    
	  }
	
		 public static void main(String[] args) {
			 Scanner sc=new Scanner (System.in);
			   String target= sc.next();
			   String word= sc.next();
			
			 

	 System.out.println( at3(target,word));
	}}