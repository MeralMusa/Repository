package replIt;

import java.util.Scanner;

public class catDog {

	public static void main(String[] args) {
		// Print true if the string "cat" and "dog" 
//		appear the same number of times in the given string word. 

		 Scanner scan = new Scanner(System.in);
		    int countOfCats = 0;
		    int countOfDogs = 0;
		    String word = scan.next();
		    
	

	        for ( int i = 0; i < word.length() - 2; i++ )
	        {
	            if ( "cat".equalsIgnoreCase( word.substring( i, i + 3 ) ) )
	            {
	                countOfCats++;
	            }
	            if ( "dog".equalsIgnoreCase( word.substring( i, i + 3 ) ) )
	            {
	                countOfDogs++;
	            }
	        }

	       if( countOfCats == countOfDogs&&countOfCats!=0&&countOfDogs!=0) {
	    	   
	    	   System.out.println(true);
	       }
	    }}