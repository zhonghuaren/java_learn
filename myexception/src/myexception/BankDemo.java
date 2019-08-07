package myexception;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount c = new CheckingAccount(101);
		System.out.println("Depositing $500...");
		c.deposit(500.00);
		try {
			System.out.println("Withdrawing $100...");
			c.withdraw(100.00);
			System.out.println("Withdrawing $600...");
			c.withdraw(600.00);
		} catch (InsufficientFundsException e) {
			System.out.println("Sorry, but you are short $" + e.getAmount());
			e.printStackTrace();
		}
	}

}
