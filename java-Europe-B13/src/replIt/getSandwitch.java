package replIt;

import java.util.Scanner;

public class getSandwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
		     String str = scan.next();
		     
		     int count=0;
		     for (int i=0;i<str.length()-4;i++) {
		    	 
		    	
		    	if(str.substring(i, i+5).equals("bread")) {
		    		
		    		count++;
		    	}
		    	 
		    	 
		     }
		     
		     if (count==2) {
		    	 
		    	 String[]Dum=str.split("bread");
		    	 
				  String dum1=Dum[1].split("bread")[0];

		    	 System.out.println(dum1);
		     }else if(count>2){
		    	 
		    	 String[]Dum=str.split("bread");
		    	 
				  String dum1=Dum[2].split("bread")[0];

		    	 System.out.println("bread"+dum1);
		    	 
		     }else if (count<2) {
		    	 
		         System.out.println("nothing");

		     }
	}}