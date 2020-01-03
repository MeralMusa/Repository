package replIt;

import java.util.Arrays;

public class MethodsWithString15Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word1="Silent";
		String word2="Listen";
		
				
		System.out.println(isAnagram(word1,word2));
	}

	
	 public static boolean isAnagram(String word1, String word2) {
	     word1=word1.toLowerCase();
	      word2=word2.toLowerCase();

	      
	      if (word1.length() != word2.length()) {
	        return false;
	    }
	    char[] a1 = word1.toCharArray();
	    char[] a2 = word2.toCharArray();
	    
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    String str="";
	    String str2="";
	    	for(int i =0;i<a1.length;i++) {
	    		
	    		
	    		str+=a1[i];
	    }
      for(int i =0;i<a2.length;i++) {
	    		
	    		
	    		str2+=a2[i];
	    }
      
      
      if (str.equalsIgnoreCase(str2)) {
    	  
    	  return true;
      }else {
    	  return false;
      }

	   
	    
	  }
}
