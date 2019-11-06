package replIt;

import java.util.Scanner;

public class ArraysAvaragTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
			int k = 0;
			double total = 0;
			double avgTemp = 0;
			double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
					scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
	
	
	
	for (int i=0;i<temps.length;i++) {
		
		total=total+temps[i];
		k++;
	}
	
System.out.println(total/k);
	
	}
	}
	