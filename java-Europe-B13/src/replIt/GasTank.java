package replIt;

public class GasTank {
	 double amount =0;
	 double capacity;
	 
	public GasTank(double i){
	  
	capacity=i;
	  
	  
	}

	public void addGas(double incr) {
		
	
	amount = amount < capacity ? amount+incr : capacity; 
	
	}

	public void useGas(double decreasGas){
	  
		amount -= decreasGas; 
		if(amount < 0) 
			amount = 0;
	  
	}
	public boolean isEmpty(){
	  boolean lesThan=false;
	  if (amount<0.1){
	    lesThan=true;
	  }else{
	    lesThan=false;
	  }
	  
	  return lesThan;
	}
	public boolean isFull(){
	  boolean greatThan =false;
	  if (amount>(capacity-0.1)){
	    
	    greatThan=true;
	  }else{
	    
	    greatThan=false;
	  }
	  return greatThan;
	}
	  
	  public double getGasLevel(){
	    return amount;
	    
	    
	  }

	      public double   fillUp(){
	        double diff =capacity-amount;
	        
	        amount=capacity;
	        return diff;
	      }

	}


