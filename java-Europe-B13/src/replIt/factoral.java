package replIt;
import java.util.*;
public class factoral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
		 int n = scan.nextInt();
	        
	        long num = 1;
	        long factorial = 1;
	        
	        
	        while (num <= n) {
	            factorial *=num;
	            num++;
	        }
	        
	        System.out.println(factorial);
	        
	        
	}

}
