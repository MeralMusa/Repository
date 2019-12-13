package day41_Abstraction;

public interface Electric {
	
	
	public static final boolean HAS_BATTERIES=true;
	
	boolean HAS_BATTERIES2=false; //public final static
	
	public abstract void charge();
	
	void charge2(); //public abstract
	
	public default void methodA() {
		
		//code
		
	}
	
	public static void MethodB() {
		//code
	}
	
	
	
	

}