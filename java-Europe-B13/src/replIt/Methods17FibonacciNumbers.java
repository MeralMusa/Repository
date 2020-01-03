package replIt;

import java.util.Scanner;

public class Methods17FibonacciNumbers {

	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
		  }
		  
		  public static void fib(int num){
			
		   if (num==1){
		     		  System.out.println(0);
		   }else if(num==2){
		     		     		  System.out.println(1);
		   }else if(num>2) {
		 
		  int n1=0,n2=1,n3=0,count=num; 

		 for(int j=2;j<count;++j){    
		  n3=n1+n2;    
		  n1=n2;    
		  n2=n3;    
		 }
		  System.out.println(n3);

		 }    
		}

		  }
		