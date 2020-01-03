package replIt;

import java.util.ArrayList;

public class MethodsWithArrayList3CombineArrays {

	public static void main(String[] args) {
		
		String[] r1= {"f","o","o"};
		String[] r2= {" b","a","r"};
		
		System.out.println(combineRs(r1,r2));
;	}
	 public static String combineRs(String[] r1,String[] r2) 
	  {
		  ArrayList<String> arr = new ArrayList<String>();

	  String dum3="";
	  
	  for(String dum: r1){
	    
	    
		    dum3 += dum;

	  
	  } 
	  for(String dum2: r2){
		    
		    dum3 += dum2;

		  }
	      
	 
	     
	      
	      return dum3;
	}
}
