package replIt;

import java.util.Scanner;

public class arraysPrintFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
	    
	    for(int i=0;i<words.length;i++) {
			System.out.println(words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
		
			
			
			
	}}

}
