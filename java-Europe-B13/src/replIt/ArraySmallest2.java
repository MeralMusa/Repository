package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySmallest2 {

	public static void main(String[] args) {
		// Write a program that will find out shortest 
//		words in the given string str. If there are few 
//		words that are evenly short, print them all. Use split 
//		method in order to split str string variable and create
//		an array of strings.  Print array with Arrays.toString() 
//		method. Sort array before printing. 
//	
//		input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
//		output: [cat, old, ray]
//		Split values by comma: split(", ");

		   Scanner scan = new Scanner(System.in);
	        String str = scan.nextLine();
	        String[] arr = str.split(", ");
	        Arrays.sort(arr);
	        String word = arr[0];
	        String word2="";
	        for (int i = 0; i < arr.length-1; i++) {
	            
	            if (arr[i].length() <= word.length()) {
	                if(arr[i].length() > arr[i+1].length()) {
	                    continue;
	                }
	                word = arr[i];
	                word2+=word + ", ";
	            }
	        }
	        String arr2[] = word2.split(", ");
	        System.out.println(Arrays.toString(arr2));
	        scan.close();
	  }
	}