package day33_ClassesPbjects_Constructures;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		System.out.println("What is your starting balance");
		
		input = sc.next();  //500
		
		BankAccount account = new BankAccount(input);
		
		System.out.println("How much were u paid this month?");
		input = sc.next();
		
		account.deposit(input);
		
		System.out.println("Your pay has been deposited. Your current balance is: " + account.getBalance());
		
		
	}

}
