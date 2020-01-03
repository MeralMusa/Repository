package replIt;

import java.util.Scanner;

public class MethodsWithReturn3IsEven {

	 public static boolean isEven(int n)
	  {
	    
	    boolean x=true;
	    if (n%2==0){
	    	x=x;
	    	
	    }else if (n%2!=0){
	    	
	    	x=!x;
	    }
	    
	    return x;
	  }
	 
	 
	  public static void main(String[] args) {
	 
	 Scanner sc = new Scanner (System.in);
	 
	 int n=sc.nextInt();
	 
	 System.out.println(isEven(n));
		  
	}
}