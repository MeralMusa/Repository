package replIt;

public class revearseExample {

	public static void main(String[] args) {
		
		String word="ABCDEFG";
		String dum="";
		
		
		for (int i=word.length()-1;i>=0;i--) {
			
			
			dum+=word.charAt(i);
			
		}
		System.out.println(dum);
		
	}
}
