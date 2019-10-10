package assignment3;

public class q15_SumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upperBound = 100;
		int ctr = 1;//Sum should start with 1 till upperBound
		int sum = 0;//Variable to store sum of the numbers
		while (ctr <= upperBound) {
		    sum += ctr;
		    ctr++;
		}
		System.out.println("Sum of the numbers from 1 to " + upperBound + " is:" + sum);

	}

}
