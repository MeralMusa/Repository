package day36_StaticClassMembers;

public class StaticInit {
	
static final int NUM_SECONDS_PER_HOURS;
	
	
	
	
	
	static {
		System.out.println("Static init");
		int numSecondsPerMinute=60;
		int numMinutesPerHours=60;
		NUM_SECONDS_PER_HOURS=numMinutesPerHours*numSecondsPerMinute;
	}
	
	private static int one;
	//private static final int two;
	private static final int three=3;
	//private static final int four;
	
	/*
	static {
		
		one=1;
		two=2;
		three=4; //does not compile
		two=4;
	}
	*/
	
	
	
	


}
