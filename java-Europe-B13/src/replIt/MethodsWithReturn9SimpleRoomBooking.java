package replIt;

import java.util.Scanner;

public class MethodsWithReturn9SimpleRoomBooking {

	public static void main(String[] args) {

	
		Scanner sc=new Scanner(System.in);
		
		
		boolean isAvailable=sc.nextBoolean();
		
     	int	month=sc.nextInt();
     	
		int day=sc.nextInt();
		
		int year=sc.nextInt();
		
		System.out.println(simpleRoomBook(isAvailable, month, day, year));
	}

	
	
	  public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
		int [] date=new int[8];
		String s1 = Integer.toString(month); 
        String s2 = Integer.toString(day); 
		String s= s1 + s2;
        int c = Integer.parseInt(s); 

		date [0]=71;
		date [1]=72;
		date [2]=73;
		date [3]=74;
		date [4]=75;
		date [5]=76;
		date [6]=77;
		date [7]=78;
		  
		 
		
		if(isAvailable==true) {
		
			if (year==2018) {
			
			for(int i =0;i<date.length-1;i++) {
				if(  c== date[i]) {
					isAvailable=false;
					break;
				}else {
					isAvailable=true;

				}
			}
		
		
		}else {
			isAvailable=false;

		}
		
		}else {
			isAvailable=false;

		}
		  return isAvailable;
	    

	  }
	}
	
