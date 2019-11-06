package replIt;

import java.util.Scanner;

public class printTriangle {

	public static void main(String[] args) {
		// Assume that the int variables i and j have been declared, and that n has been declared and initialized.
		// Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.

		
		
		    int i = 1;
			int j = 1;
			
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			
			for (i = 0; i < n; i++) {
			    for (j = 0; j <= i; j++) {
			        System.out.print("*");
			    }
			    System.out.println();
			}				
				
			}
			
	}


