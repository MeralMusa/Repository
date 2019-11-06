package replIt;

import java.util.Scanner;

public class arraysSplitSentence {

	public static void main(String[] args) {
		// Given a String variable sentence, write code to type each word in separate lines.
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    

	String[] arr = sentence.split(" ");    

     for ( String words : arr) {
    System.out.println(words);
}

}
}