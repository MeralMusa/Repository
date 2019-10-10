package assignment3;

public class q18_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 1; i <= 4; i++) 
		 {
		     //Printing i spaces at the beginning of each row
		     String y="";
		     for (int j = 1; j < i; j++) 
		     {
		         y=y+" ";
		     }
		     //Printing i to rows value at the end of each row
		     String x="";
		     for (int j = i; j <= 4; j++) 
		     { 
		         x=x+j+" "; 
		     } 
		     System.out.println(y+x);
		 } 

	}

}
