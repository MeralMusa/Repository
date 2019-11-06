package replIt;

import java.util.Arrays;

public class arraysCopyCertainValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  }
	  
	  
	  
	  public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
	    int count=0;
       
	 String[] fewValues=new String [arr.length];
	for(int i =0;i<arr.length;i++) {
		 
		 if(arr[i].contains("e")  ) {
			
			 
			 fewValues[i]=arr[i];
			 count++;
		
		 }
		

 }
	 
	 System.out.println(Arrays.toString(fewValues));
	
	 String[] value=new String [count];
	    
	    for (int j=0;j<fewValues.length;j++) {
	    	
	    	if (fewValues[j].contains("null")) {
	    	value[j]=fewValues[j];

	    }}
		return value;
	    		
	    		
	    //YOUR CODE ENDS HERE -----------------------
	    

		
	  }
	  
	  
	  
	}
	