package replIt;

import java.util.Scanner;

public class hasAJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean exists = false;
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    

	

			if (0 == word.indexOf("java", 0) || 1 == word.indexOf("java", 1)) {

				exists = true;
			}
			System.out.println(exists);
		     }
		    
	}


