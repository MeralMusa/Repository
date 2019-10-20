package replIt;
import java.util.*;
public class party {

	public static void main(String[] args) {
//		Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
//		Ask for the first guest name.
//		Then ask does user want to enter one more guest.
//		 If yes - take input from.
//		If not - finish the program and print list of the guests.
//
//		Example of the program:
//
//		Please enter guest name:
//		Nick
//		Do you want to enter new guest name:
//		yes
//		Please enter guest name:
//		Linda
//		Do you want to enter new guest name:
//		no
//
//		Guest's list: Nick, Linda
	    
		
		Scanner input = new Scanner(System.in);

      String forward="yes";
 for (int i =0;i<2;i++) {
	
	 
	 
	 String name ="";
	 
	 if  (forward.equalsIgnoreCase("no")) {
		 break;
	 }
	 System.out.println("Please enter guest name:");

	 name=name+input.nextLine();

	 
	 for (int j=0;j<100;j--) {
	 if(j<0) {
	 System.out.println("Please enter guest name:");
	 
	 
	 name=name+", "+input.nextLine();
	 }
	 
	 System.out.println("Do you want to enter new guest name:");
          forward=input.nextLine();
	
          
          if (forward.equalsIgnoreCase("no")) {
		 
		 System.out.println("Guest's list: "+name);
		 
		 break;
		 
          }

	 }
 }
     
         

	}
	
}
           