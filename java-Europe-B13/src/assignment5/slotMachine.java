package assignment5;
import java.util.*;
public class slotMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       Random rm = new Random();
	       String contin = "yes";
	       int money;
	       int s1;
	       int s2;
	       int s3;
	       int x=0;
         int enteredMoney =0;
	       while (contin.equalsIgnoreCase("yes"))
	       {
	           s1 = rm.nextInt(6);
	           s2 = rm.nextInt(6);
	           s3 = rm.nextInt(6);
	           System.out.println("Put the Money into the slot! ");
	           money = sc.nextInt();

	           switch (s1) 
	           {
	               case 0:
	                   System.out.println("Cherries");
	                   break;
	               case 1:
	                   System.out.println("Oranges");
	                   break;
	               case 2:
	                   System.out.println("Plums");
	                   break;
	               case 3:
	                   System.out.println("Bells");
	                   break;
	               case 4:
	                   System.out.println("Melons");
	                   break;
	               case 5:
	                   System.out.println("Bars");
	                   break;
	           }

	           switch (s2) 
	           {
	               case 0:
	                   System.out.println("Cherries");
	                   break;
	               case 1:
	                   System.out.println("Oranges");
	                   break;
	               case 2:
	                   System.out.println("Plums");
	                   break;
	               case 3:
	                   System.out.println("Bells");
	                   break;
	               case 4:
	                   System.out.println("Melons");
	                   break;
	               case 5:
	                   System.out.println("Bars");
	                   break;
	           }

	           switch (s3) 
	           {
	               case 0:
	                   System.out.println("Cherries");
	                   break;
	               case 1:
	                   System.out.println("Oranges");
	                   break;
	               case 2:
	                   System.out.println("Plums");
	                   break;
	               case 3:
	                   System.out.println("Bells");
	                   break;
	               case 4:
	                   System.out.println("Melons");
	                   break;
	               case 5:
	                   System.out.println("Bars");
	                   break;
	           }

	           if (s1 != s2 && s1 != s3 && s2 != s3)
	           {
	        	    x=2;
	               System.out.println(" Sorry!  you won $0");
	               
	               
	           }
	           else if (s1 == s2 || s1 == s3 || s2 == s3)
	           {	   
	        	   enteredMoney=money;
	        	  money =money*2;

	               System.out.println("Congratulation, you have won $" + money);
	           }
	           else if (s1 == s2 && s1 == s3 && s2 ==s3)
	           {	               
	        	  enteredMoney=money;

	        	   money=money*3;  
                   
	               System.out.println("Congratulation, you have won $" +money);
	           }
	    

	           System.out.println("Continue? yes/no ");
	           contin = sc.next();
	           if (contin.equalsIgnoreCase("no")) {
	        	
	        	   if (x==2 ) {
		               System.out.println("you entered $"+money+" and you won $0");

	        	   }else
	        	 	  System.out.println("Congrat you entered $"+enteredMoney+" and you won: $"+money);
	           }
	           
	}

}
}