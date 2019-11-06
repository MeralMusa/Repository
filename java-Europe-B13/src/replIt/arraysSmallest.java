package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class arraysSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
	
		    
		    int[]length=new int[5];
			
				for(int i = 0; i < 5;  i++) {
				  

				 length[i]=str[i].length();
				}
				
	          Arrays.sort(length);
	          for (int j=0;j<str.length;j++) {
	         
	        if (length[0]==str[j].length()) {
	        	  
	        	  System.out.println(str[j]);
	        	  
	          }
		      
	          }
			}

	    
	}

