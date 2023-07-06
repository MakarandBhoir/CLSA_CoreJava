package test4;
public class Saving extends Account{
	private double roi;
	
	public Saving(long accountNumber, String holder, double balance, double roi) {
		super(accountNumber, holder, balance);
		this.roi = roi;
	}
	
	public void display() {
		System.out.println("Rate of Interest: "+roi);
		super.display();
	}

	@Override
	public void deposite(double amt) {
		//super.accountBalance += amt;
		double balance = super.getAccountBalance() + amt;
		super.setAccountBalance(balance);
		System.out.println("Balance after deposite: "+super.getAccountBalance());
	}
	@Override
	public void withdraw(double amt) {
		double balance = super.getAccountBalance();
		if(balance >= amt) {
			super.setAccountBalance(balance - amt);
			System.out.println("Balance after withdraw: "+super.getAccountBalance());
		}else {
			System.out.println("You dont have enough balance.");
		}
	}
}