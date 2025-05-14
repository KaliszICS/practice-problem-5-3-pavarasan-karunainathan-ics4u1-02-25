class SavingsAccount extends BankAccount {

	private double interestRate;
	
	public SavingsAccount(int accountNumber, double accountBalance, double money, double interestRate) {
		super(accountNumber, accountBalance);
		this.accountBalance = money;
		this.interestRate = interestRate;
	}

	public void gainInterest() {
		this.accountBalance *= (1 + interestRate);
	}

	public void setInterest(double interest) {
		this.interestRate = interest;
	}

	public double getInterest() {
		return this.interestRate;
	}

	@Override
	public boolean pin(int pin) {
		return false;
	}
}