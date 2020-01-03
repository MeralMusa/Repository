package replIt;
import java.util.Scanner;

public class methods7PlusMinus {

	 
	  
	  public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);
	  }//end main

	private static void plus_minus(int[] arr) {

		int counterneg =0;
		int counterpos=0;
		int counterzero=0;
		
		for (int i=0;i<arr.length;i++) {
			
			if (arr[i]>0) {
				counterpos++;
			}else	if (arr[i]<0) {
				counterneg++;
			
			}else	if (arr[i]==0) {
				counterzero++;
			
			}

		}
		System.out.println("positives:"+counterpos+", negatives:"+counterneg+", zeros:"+counterzero);

	}
	  
	  
	  
	}