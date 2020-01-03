package replIt;

public class MethodsWithReturn5HamletLogic {

	  public boolean hamletQuote(boolean toBe,boolean notToBe)
	  {
	    boolean behavior=true;
	    
	    if (toBe==true&&notToBe==true||toBe==true&&notToBe==false||toBe==false&&notToBe== true){
	      
	    behavior=behavior;
	  }else{
	    
	    behavior=!behavior;
	    
	    
	  }
	  return behavior;
	}
	  
	}