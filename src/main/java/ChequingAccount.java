class ChequingAccount extends BankAccount {

	protected int pinNumber;
	
	public ChequingAccount(int accountNumber, double accountBalance, double money, int pinNumber) {
		super(accountNumber, accountBalance);
		this.accountBalance = money;
		this.pinNumber = pinNumber;
	}
	
	public ChequingAccount(int accountNumber, double accountBalance, int pinNumber) { //default balance
		super(accountNumber, accountBalance);
		this.accountBalance = 0;
		this.pinNumber = pinNumber;
	}

	//Abstract methods must be overridden and implemented
	@Override
	public boolean pin(int pin) { //check if the pin is correct
		if (pinNumber == pin) {
			return true;
		}
		return false;
	}
}