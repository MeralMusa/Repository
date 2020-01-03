package replIt;

public class MethodsWithString5CleanString {

	 public static String clean (String text ,String badWord) {
		    
    String dum="";
	
		 
		   
		dum= text.replace(badWord,"");
		 
		 
		 return dum;
			
			
		
			

		}
	 
	 
	 
	 public static void main(String[]args) {
		 
		 
		 
		System.out.println( clean("one two three","two"));
		 
	 }
}