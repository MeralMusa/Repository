package day44_exceptions;

public class ORCatchBlock {

	public static void main(String[] args) {
		
		String str = "abc";
		
		try {
			
			//System.out.println(str.charAt(10));
			String str2 = null;
			System.out.println(str2.toUpperCase());
			
		}catch(IllegalArgumentException | NullPointerException e) { //Exception types can not be sub-parent types
			
			System.out.println("Eception happened: " + e.getClass().getSimpleName());
			
		}
		
		

	}

}