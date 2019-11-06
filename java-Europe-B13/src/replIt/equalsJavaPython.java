package replIt;

import java.util.Scanner;

public class equalsJavaPython {

	public static void main(String[] args) {
		// Given a string, print out true if the number of appearances of "java" anywhere in the string is
		//equal to the number of appearances of "python" anywhere in the string (case sensitive).

		
		
		 Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();
		    String dum="java";
		    String dum2="python";
		    int count=0;
		    int count2=0;
		    
		    
		   
		    for(int i =0;i<sentence.length()-3;i++) {
		    	
		   
		    	if (sentence.substring(i, i+dum.length()).equals(dum)){
		    		
		    		count++;
		    		
		    
		    	}
		    		
		    	}
		    
		       for (int j =0;j<sentence.length()-5;j++) {
		    		
		    		if (sentence.substring(j, j+dum2.length()).equals(dum2)){
			    		
			    		count2++;
			    	}
		    		
		    	}if (count==count2) {
					   
					   System.out.println(true);
				   }else {
					   System.out.println(false);
		    	
	
		    
		   
		   }
		   
		    
}}
		    

	


