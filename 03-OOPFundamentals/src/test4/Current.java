package test4;
public class Current extends Account {
	private double overdraft;
	
	public Current(long accountNumber, String holder, double balance, double overdraft) {
		super(accountNumber, holder, balance);
		this.overdraft = overdraft;
	}
	
	public void display() {
		super.display();
		System.out.println("Overdraft Limit: "+overdraft);
	}
	@Override
	public void deposite(double amt) {
		double balance = getAccountBalance() + amt;
		setAccountBalance(balance);
		System.out.println("Balance after deposite: "+getAccountBalance());
	}

	@Override
	public void withdraw(double amt) {
		double balance = super.getAccountBalance();
		if((balance+overdraft) >= amt) {
			super.setAccountBalance(balance - amt);
			System.out.println("Balance after withdraw: "+super.getAccountBalance());
		}else {
			System.out.println("You dont have enough balance.");
		}
	}
}