package replIt;

import java.util.ArrayList;

public class MethodsWithArrayLists13DeliveryCalc {

	  public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) 
	  {
	   int maxUnit=0;
		  int rest;
		  int times =0;
		  
	    for (int i =0;i<deliveries.size();i++){
	      
	      
	    	
	    	maxUnit+=deliveries.get(i);
	    	
	    	
	    }

	    rest =maxUnit%max_fuel;
	    
	    
	    times=(maxUnit/max_fuel)+rest;
		return times;
	    
	    
	  }
	  
	  public static void main(String[] args)
	  {
	    
	    ArrayList<Integer>  arr = new ArrayList<>();
	    arr.add(3);
	    arr.add(3);
	    arr.add(1);
	    arr.add(2);
	    arr.add(6);
	    int times = refuel_times(arr,3);
	    System.out.print(times);//should output 5
	   
	    
	  }//end main
	}