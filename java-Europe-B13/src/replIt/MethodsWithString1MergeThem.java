package replIt;

import java.util.Scanner;

public class MethodsWithString1MergeThem {

	 public static String mergeStrings(String one, String two) {
		    
		    String str = "";
		    int length = 0;

		    if (one.length() >= two.length())
		    {
		        length = one.length();
		    } else
		        length = two.length();

		    for (int i = 0; i < length; i++)
		    {

		        if (i < one.length())
		        {
		            str += one.charAt(i);
		        }

		        if (i < two.length())
		        {
		            str += two.charAt(i);
		        }

		    }
		    return str;
		    
		    
		  }
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in) ;
		 
		 String a=sc.nextLine();
		 String b=sc.nextLine();
		 
		 
		System.out.println(mergeStrings(a,b));
		 
		 
		 
		 
		 
		 
		 
			 
		 }
}
	