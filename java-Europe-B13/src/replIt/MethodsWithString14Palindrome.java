package replIt;

public class MethodsWithString14Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String check="Civi c";
				
		System.out.println(isPalindrome(check));
				
				
	}

	
	
	  public static boolean isPalindrome(String check) {
		  
		  
		 check = check.replace(" ","");
		  check= check.toLowerCase();
		  System.out.println(check);
		  
		  StringBuilder sb=new StringBuilder(check);  
		    sb.reverse();  
		    String rev=sb.toString();  
		    
		    
		    if(check.equals(rev)){  
		        return true;  
		    }else{  
		        return false; 
		
		  
	  }

}}
