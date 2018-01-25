
public class BankAccount {
	
	private int balance;
	

	public BankAccount(int imoney) {
		balance =0;
	}

	public BankAccount() {
	}

	public void deposit(int money) {
		balance += money;
	}

	public int getBalance() {
	
		return balance;
		
	}

	public void withdraw ( int money) {
		balance -= money;
		
	}
}