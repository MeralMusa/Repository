package replIt;

import java.util.Arrays;

public class MethodsWithArrays1MergeArrays {

	public static int[] mergR(int[] a,int[] b) {
	    
		int num =a.length+b.length;
	    
	    int[] newArr=new int[num];
	    
	    for(int i=0; i<a.length; i++){
	      
	      newArr[i]=a[i];
	    }
	    
	    for(int i=0; i<b.length; i++){
	      newArr[i+a.length]=b[i];
	    }
	    
	    
	    return newArr;
	   
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
		   int []a= {23,34,4,557,6,45345};
		   int []b= {34,5356,56,7,354};
		System.out.println(Arrays.toString(mergR(a,b)));
		
	  }
	}


