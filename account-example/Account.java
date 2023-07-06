package oop1;

/*
 * 1. When you declare class as abstract you can't create object
 * 2. method as abstract - you can have body of method
 * 3. body of abstract method should be present in child class (override)
 * 4. or your child class declare as abstract to avoid errors
 */
public abstract class Account extends Object{
	
	private long accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	public Account() {
		
	}
	public Account(long accountNumber, String accountHolderName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	public void display() {
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Account Balance: "+accountBalance);
	}
	
	public abstract void deposite(double amt);
	public abstract void withdraw(double amt);
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}
