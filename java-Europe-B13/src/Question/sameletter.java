package Question;

import java.util.Arrays;

public class sameletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="abc";
		String b="cab";
		
		System.out.println(same(a,b));
	}
	public static boolean same(String a, String b) {

		char[] ch1 = a.toCharArray();

		System.out.println(Arrays.toString(ch1));
		char[]  ch2 = b.toCharArray();

		Arrays.sort(ch1);

		Arrays.sort(ch2);

		String a1="", a2="";

		
		for(char each: ch1)

		a1 +=each;

		 

		for(char each: ch2)

		a2 +=each;

		 

		return  a1.equals(a2) ;

		}
}
