public class account {
	private double balance;
	
	public account() {}

	public account(double initialbalance) {
		this.balance = initialbalance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
}