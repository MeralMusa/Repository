package replIt;

import java.util.Arrays;

import com.sun.tools.javac.Main;

public class MethodsWith2DArrays1CurrencyConversion {

	public static  double convertC(String[][] money,String[][] convertionRate) 
	  {
		
		
		
		
		
		
		double dollar=0;
		double [] mon =new double[money.length] ;
		double [] con =new double[convertionRate.length] ; 


		for (int i =0;i<money.length;i++) {
			
			mon[i]=Double.parseDouble(money[i][1]);


		}
		

			
			for (int j =0;j<convertionRate.length;j++) {
				
				
		con[j]=Double.parseDouble(convertionRate[j][1]);

				
				
				
				
				
			}
		  
			for (int i =0;i<mon.length;i++) {
				
				dollar+=mon[i]*con[i];
			}
	

		
	  
		
			 
	  
		
		
		return dollar;
	  
	  }
	  
	    public static void main(String[] args) 
	   {
	     
	     
	     
	     String[][] test_money =
	     {
	       {"mark","5"},
	       {"shekel","30.5"},
	       {"Golden","40"},

	     };
	     
	     String[][] test_convert=
	     {
	       {"mark","1"},
	       {"shekel","0.5"},
	       {"Golden","0.5"},

	     };
	     
	     double res = convertC(test_money,test_convert);
	     System.out.print(res);
	     
	   }

	  
	}