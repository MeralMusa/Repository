package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDiving {

	public static void main(String[] args) {
		//In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value. 
//		The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive. 
//		The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.
//		
//		
//		
	    Scanner input = new Scanner(System.in);
	    float[] score = new float[7];
	    //WRITE YOUR CODE HERE
	    float total=0.0f;

	    for (int i=0;i<=score.length-1;i++) {
	    	System.out.println("Enter score for judge "+(i+1)+":");
	    	score[i]=input.nextFloat();

	    }
	    System.out.println("Enter difficulty:");
	    Arrays.sort(score);	  
	    
	    float dificulty=input.nextFloat();

	    for (int i=0;i<=score.length-1;i++) {
	    	

	    	total+=score[i];
	    	
	    }
	    
	    total=total-score[0]-score[score.length-1];
	   
	    total=total*dificulty;
	    	total=total*0.6f;
	    
	    	
	    System.out.printf("Total: %.2f",total);

	  }
	}
		
