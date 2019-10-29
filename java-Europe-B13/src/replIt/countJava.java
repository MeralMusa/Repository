package replIt;

import java.util.Scanner;

public class countJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan= new Scanner(System.in);
		    String word = scan.next();
		    
		    int count=0;
		    for(int i =0;i<word.length()-3;i++) {
		    	
		    if (word.substring(i,i+4).equalsIgnoreCase("java")) {
		    	
		    	count++;
		    }
		    	
		    }
		    		   System.out.println(count);

	}

}
