package replIt;

import java.util.Scanner;

public class PrefixAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 Scanner scan = new Scanner(System.in);
		    String str = scan.next();
		    int n = scan.nextInt();
		    String dum="";
		    int count=0;
		    
		    
		    dum=  str.substring(0, n);
System.out.println(dum);
		    for(int i =0;i<str.length()-(n-1);i++) {
		    	
		   
		    	if (str.substring(i, i+n).equalsIgnoreCase(dum)){
		    		
		    		count++;
		    		
		    		if (count==2) {
		    			
		    			System.out.println(true);
		    			System.out.println(dum +" appears twice");
		    	
		    		}
		    		
		    		
		    	}
		    		
		    
		    }if (count==1) {
		    			
		    			System.out.println(false);
		    			System.out.println(dum +" appears once only");
		    	
		   
		    	
		    }
		    }

		    
}