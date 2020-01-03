package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class Methods11addtoarray {

	  public static void add_to_r(int[] arr,int n) {
			
			int[] new_r=new  int [arr.length+1] ;
			for (int i = 0;i<arr.length;i++) {
			 
				System.out.println(new_r[i]=arr[i]);

			}
					
					new_r[new_r.length-1]=n;

				
		
			System.out.println(Arrays.toString(new_r));

		}
	  
	  public static void main(String[] args) {
	    
	    
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt(),n = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	     add_to_r(arr, n);
	   
	    
	  }
	}