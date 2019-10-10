package assignment2;

public class q3_leapYear {
	public static void main(String[] args) {
		
		
		
		int year = 1992;
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
		    System.out.println(year + " is a leap year");
		} else {
		System.out.println(year + " is NOT a leap year");
		}

		
		
	}
}
