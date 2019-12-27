
public class Methods5SimplePrintPattern {

	  public static void printHollowRect()
	  {
	   for (int i=0;i<1;i++){
	     
	     for(int j=0;j<5;j++){
	       
	       if (j==0||j==4){
	         
	         System.out.println("*****");
	         
	       }else if (j>0&&j<4){
	         
	                  System.out.println("*   *");

	       }
	       
	     }
	   }
	   
	   
	   
	  }
	  
	  public static void main(String[] args) {
	   
	    printHollowRect();
	  }
	  
	  
	  
	  
	}