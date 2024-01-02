package entities;

public class Bank {
	
	private int numberAccount;
	private String name;
	private double balance;   
	
	


	public Bank(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}
	



	public int getNumberAccount() {
		return numberAccount;
	}


	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value;
	}


	@Override
	public String toString() {
		return "Account: " + numberAccount + ", Holder: " + name + ", Balance: " + balance;
	}
	
	
	
	
	

}
