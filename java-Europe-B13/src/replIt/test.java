package replIt;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =5;

int[] arr=new int [5];

		int add=n;
		int lengt =arr.length;
		
		System.out.println(lengt);
		int[] new_r=new  int [lengt] ;
		for (int i = 0;i<new_r.length-1;i++) {
		 
			System.out.println(new_r[i]=arr[i]);

			if(i==new_r.length-1) {
				
				
				System.out.println(new_r[lengt]);

			}
				
			}
			

			

		
		System.out.println(Arrays.toString(new_r));

	}
  
}
