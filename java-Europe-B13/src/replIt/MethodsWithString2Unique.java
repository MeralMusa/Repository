package replIt;

public class MethodsWithString2Unique {

	 public static void main(String[] args) {
    //test your code
    System.out.println( uniqueChars("wooden-spoon"));
  }
  
public static String uniqueChars(String str) {
	String newstr="";
	System.out.println(newstr.indexOf(str.charAt(11)));
	
	
    for (int i = 0; i < str.length(); i++){
       if (newstr.indexOf(str.charAt(i)) == - 1){
    	   newstr = newstr + str.charAt(i);
    }
 }	
	  
		  
		  
	  
	  
	  return newstr;
    //TODO: write your below
    
  }
}