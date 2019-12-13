package replIt;

import java.util.Scanner;

public class float4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 Scanner input = new Scanner(System.in);
		    float[] score = new float[7];
		    //WRITE YOUR CODE HERE
		    float total=0.0f;

		    for (int i=0;i<=score.length-1;i++) {
		    	System.out.println("Enter score for judge "+(i+1)+":");
		    	score[i]=input.nextFloat();
		    	
		    	

	}
		    
		    System.out.println(score[1]);

}
}