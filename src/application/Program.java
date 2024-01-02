package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Enter the account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		String name = sc.next();
		Bank bank = new Bank(number, name); 
		sc.next();
		
		
		System.out.println("I's there a initial deposit? (y/n): ");
		String answer = sc.next();
		
		if(answer.contains("y")) {
			System.out.println("Enter the initial deposit: ");
			bank.deposit(sc.nextDouble());
		}
			System.out.println(bank);
			System.out.println();

			
			System.out.println("Enter a deposit value: ");
			bank.deposit(sc.nextDouble());
			System.out.println("Update account data: ");
			System.out.println(bank);
			System.out.println();
			
			System.out.println("Enter a withdraw value: ");
			bank.withdraw(sc.nextDouble());
			System.out.println("Update account data: ");
			System.out.println(bank);
			
	
		
		

		
	}

}
