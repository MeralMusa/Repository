package replIt;

import java.util.ArrayList;

public class MethodsWithArrayList11AppendPosSum {

	public static void main(String[] args) {
		
		  ArrayList <Integer> arr=new ArrayList<Integer>();

		  arr.add(2);
		  arr.add(-8);
		  arr.add(3);
		  arr.add(-2);
		  arr.add(-5);
		  arr.add(2);
		  arr.add(5);
		 System.out.println(appendPosSum(arr));
	}
	public static ArrayList <Integer>	appendPosSum(ArrayList <Integer> arr ){
		  
		  ArrayList <Integer> arr2=new ArrayList<Integer>();
		  
		  for (int n : arr) {
		        if (n >= 0) {
		            arr2.add(n);
		        }
		}
		  
		  int sum = 0;
		    for (int i: arr2) {
		        sum += i;
		    }
		    
		    arr2.add(sum);
		  
		  return arr2;

}
}