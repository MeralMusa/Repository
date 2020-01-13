package Question;

public class StringFrequencyOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(FrequencyOfChars("AAABBCDD"));
		
	}
	public static String FrequencyOfChars(String str) {

		System.out.println(str.charAt(0));
		String nonDup = "";

		for(int i=0; i < str.length(); i++)

		if(!nonDup.contains(""+str.charAt(i)))

			
		nonDup+= str.charAt(i);

		 

		String expectedResult = "";

		for( int j=0;j < nonDup.length(); j++) {

		int count = 0;

		for(int i=0; i < str.length(); i++) {

		if(str.charAt(i) == nonDup.charAt(j))

		count++;

		}

		expectedResult +=nonDup.charAt(j)+"" + count;

		}

		return expectedResult;

		}
}
