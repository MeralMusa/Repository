package replIt;

public class MethodsWithString12ExtractNumber {

	public static void main(String[] args) {
		
		String s ="kdmd432kmf39";
		String dum="";
		  for(int i=0;i<s.length();i++){
		    
		    if (Character.isDigit(s.charAt(i))){
		      
		      dum+=s.charAt(i);
		      
		    }
		  }
System.out.println(dum);
	}

}
