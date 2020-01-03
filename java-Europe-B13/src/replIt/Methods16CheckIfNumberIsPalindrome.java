package replIt;

import java.util.Scanner;

public class Methods16CheckIfNumberIsPalindrome {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
		  }
		  
		  public static void isPalindrome(int num){
			  int palindrome = num;
			    int reverse = 0;
			  
			  
			// Compute the reverse
			    while (palindrome != 0) {
			        int remainder = palindrome % 10;
			        reverse = reverse * 10 + remainder;
			        palindrome = palindrome / 10;
			    }

			    // The integer is palindrome if integer and reverse are equal
			    if( num == reverse) {
			    	System.out.println(true);
			    	
			    }else {
			    	System.out.println(false);
			    }
			    
		  }
		    
		  }
		