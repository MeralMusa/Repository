package replIt;

public class MethodsWithReturn2max {

	  public int max(int x,int  max)
	  {
		  
		  int dum=0;
	    if (x>max){
	       dum=max;
	    }else if(max>x ||max==x){
	      dum= x;
	    }
		return dum;
	    
	  }
	}