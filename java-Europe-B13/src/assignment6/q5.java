package assignment6;
import java.util.*;
public class q5 {

	public static void main(String[] args) {

//		Question 5:
//			In mathematics, the Fibonacci series are the numbers in the following integer sequence:
//			0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
//			By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
//			and each subsequent number is the sum of the previous two.
//
//			Write a Java Program to generate above series till n number of times (For example you can try with
//			n = 10 and n = 15) and store it in One-dimensional array.
//			For n = 10, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//			For n = 15, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
//
//			Write a for loop to print all the elements of the array.
//		
		Scanner sc=new Scanner (System.in);
		int n= 0;
		
		n=sc.nextInt();
		int []arr = new int [n];
		int d1=0;
		int d2=1;
		int d3;
		if (n==10) {
			
			for (int i=0;i<n;i++) {
				
				d3=d1+d2;
				
				
				arr[i]=d1;
				
				System.out.print(arr[i]+" ");
				
				d1=d2;
				d2=d3;
			}
			
		}else if(n==15) {
for (int i=0;i<n;i++) {
				
				d3=d1+d2;
				
				
				arr[i]=d1;
				
				System.out.print(arr[i]+" ");
				
				d1=d2;
				d2=d3;
			}
			
		}
		
		
	}

}
