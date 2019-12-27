package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysZombieAttack3 {

	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    
		  int day = 0;

				    System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
				    while (!Arrays.stream(inhabitants).allMatch(x -> x == 0)) {
				    	  
				    	  for (int j=1;j<inhabitants.length;j++) {
				    		  if(inhabitants[j] > 0 && inhabitants[j-1 ] == 0)
				    			  inhabitants[j] /= -2;
				    		  if(inhabitants[6] ==0)
				    			  inhabitants[7] /= 2;

				    			  
				    		  
				    	   for(int i = inhabitants.length -2; i >= 0; i--) 
				    		        if(inhabitants[i] < 0)
				    		        	inhabitants[i] = -inhabitants[i];
				    		        else if(inhabitants[i] > 0 && inhabitants[i + 1] == 0)
				    		        	inhabitants[i] /= 2;
				    	   
					    	  day++;
					    	  
					    	  if (inhabitants[0]==0&&inhabitants[1]==0&&inhabitants[2]==0&&inhabitants[3]==0&&inhabitants[4]==0&&inhabitants[5]==0&&inhabitants[6]==0&&inhabitants[7]==0) {
					    		  
					    		  break;
					    		  
					    	  }

				    	   System.out.println("Day "+(day)+" "+Arrays.toString(inhabitants));

				    	  }}		    	   
				    System.out.println("Day "+(day)+" "+Arrays.toString(inhabitants));

				    System.out.println("---- EXTINCT ----");

				    	  
				 }
		}  
