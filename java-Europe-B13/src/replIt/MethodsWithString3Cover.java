package replIt;

public class MethodsWithString3Cover {

	  public static void main(String[] args) {
		    System.out.println(coverString("Certified Wooden Spoon", "o") ) ; //java [me]thods
		  }
		  
		  public static String coverString(String main, String coverME) {
			
				  
			  
			  if ( main.indexOf(coverME)!=-1){
				  
			  
			       
			    	 main=  main.replace(coverME, "["+coverME+"]");
			    	   

			  
			  }else {
				  
			    	 main=  main.replace(main, "["+main+"]");

			  }
			  
			return main;

		  
		  }
		  
}