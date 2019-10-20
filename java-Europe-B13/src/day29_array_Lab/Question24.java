package day29_array_Lab;

public class Question24 {

		// TODO Auto-generated method stub

		
	    public static void main(String[] args) {
	       
	    	int[] x= {1,2,1,3};
	        int b=2;
	        
	        
	        System.out.println(numberArray(x,b));
	    }
	    public static boolean numberArray(int[] arr,int a) {
	        
	    	for(int i=0;i<arr.length-2;i++) {
	           
	        	
	        	if(arr[i]==a && arr[i+1]==a || arr[i+2]==a) {
	            
	        		
	        		return true;
	            }
	        
	        }return false;
	        
	        
	        
	    }
	}