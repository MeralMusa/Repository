package replIt;
import java.util.Scanner;

public class Methods12TimeConversion {

	  public static void main(String[] args) {
		  
		  
		    /*
				Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format * Write your code here.
Input: 07:05:45PM
Output: 19:05:45
				 */
		    Scanner scan = new Scanner(System.in);
		    timeConversion(scan.nextLine());
		  }
		  
		  public static void timeConversion(String s) {

			  if (s.contains("AM")) {
				  s=s.replace("AM", "");
				  
		            String[] timeArr = s.split(":");

				  if (timeArr[0].equals("12")) {
				
					  timeArr[0]=  "00";
			  }
				  s = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];

		            System.out.println(s);

			  } else if(s.contains("PM")){
		            s = s.replace("PM", "");
		            String[] timeArr = s.split(":");
		            if(!timeArr[0].equals("12")){
		                timeArr[0] = Integer.toString(Integer.parseInt(timeArr[0])+12);
		            }
		            s = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];

		            System.out.println(s);
			  }
				 
		  }
		}