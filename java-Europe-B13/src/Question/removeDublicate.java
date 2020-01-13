package Question;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDup1("AAABBCDD"));
		System.out.println(removeDup2("AAABBCDD"));

	}
	public static  String  removeDup1( String  str) {

		String result = "";

		    for (int i = 0; i < str.length(); i++)

		        if (!result.contains(""+str.charAt(i)))

		        result += "" + str.charAt(i);

		 

		    return result;

		}
	
	public static String removeDup2(String str) {

		str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

		str = str.replace(", ","").replace("[","").replace("]","");

		    return  str;

		}
}
