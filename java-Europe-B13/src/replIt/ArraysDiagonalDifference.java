package replIt;

import java.util.Scanner;

public class ArraysDiagonalDifference {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
		                            };
		    int n=3;
		    		    
		    System.out.println(difference(matrix,n));

		    
		    
		    
		}

	private static int difference(int[][] matrix, int n) {
	    int diagonal2=0;
	    int diagonal1=0;
         int result=0;
	    
	    
	    for (int i = 0; i < n; i++){ 
			for (int j = 0; j < n; j++) 
            { 
                if (i == j) 
                   diagonal1 += matrix[i][j]; 
       
                if (i == n - j - 1) 
                    diagonal2 += matrix[i][j]; 
            }
            
	    
	}
	   
	    
	   
		return  Math.abs(diagonal1-diagonal2); 

	}}