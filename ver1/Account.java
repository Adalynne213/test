package ver1;

public class Account {
	// Instance variable, only available inside this class.
	private double balance;
	// Constructor
	public Account(double initBalance) {
		balance = initBalance;
	}

	// A "getter" method that simply returns the balance.
	public double getBalance() {
		return balance;
	}

	// A method that increases the balance by amount
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	public void withdraw(double amount) {
		if(amount>0) {
			balance -= amount;
		}
	}
	public String toString() {
		String msg = "balance=$" + balance;
		return msg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Account a1 = new Account();
//		a1.setBalance(1000.00);
//		System.out.println("Balance=$" + a1.getBalance());
		Account a1 = new Account(1000.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.deposit(500.0);
		System.out.println("Balance=$" + a1.getBalance());

		a1.withdraw(200.0);
		System.out.println("Balance=$" + a1.getBalance());

		System.out.println(a1.toString());
		System.out.println(a1);

	}

}
