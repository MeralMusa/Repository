package replIt;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysZombieAttack2 {

	public static void main(String[] args) {
		// An array inhabitants represents cities and their 
//		respective populations. For example, the following arrays
//		shows 8 cities and their respective populations:
//[3, 6, 0, 4, 3, 2, 7, 1]
//Some cities have a population of 0 due to a pandemic zombie 
//disease that is wiping away the human lives. After each day, 
//every city will lose half of its population.
//write a program to loop though each city population and make it lose 
//half of its population until all cities have no humans left. Make updates 
//to each element in the array And print the array like below for each day:

		
		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    System.out.println("Day "+0+" "+Arrays.toString(inhabitants));

		      for (int i=0; i>-1; i++) {
		    	  
		    	  for (int j=0;j<inhabitants.length;j++) {
		    		  
		    		  inhabitants[j]=inhabitants[j]/2;
		    	  }


System.out.println("Day "+(i+1)+" "+Arrays.toString(inhabitants));

if (inhabitants[0]==0&&inhabitants[1]==0&&inhabitants[2]==0&&inhabitants[3]==0&&inhabitants[4]==0&&inhabitants[5]==0&&inhabitants[6]==0&&inhabitants[7]==0) {
	
	System.out.println("---- EXTINCT ----");
	
	break;
}
		    	  
		 }}
		      

}
		  
			        
	


