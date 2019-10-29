package assignment6;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		//Question 1:

//Write a Java Program 
//to store numbers from 1 to 1000 in One-dimensional 
//array and then print array contents as follows (10 elements per row):

		
		
		int [] arr=new int [1001];
		
		
		for (int i=0;i<=arr.length-1;i++) {
			
			
			
			arr[i]=i;
								
								if(i!=0) {
									
									System.out.print(arr[i]+" ");

									if (i%10==0) {
									System.out.println("");
								}}

		}

		
	}

}
