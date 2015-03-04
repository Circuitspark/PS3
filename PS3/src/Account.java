import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	public Account(int a, double b, double c) {
		id = a;
		balance = b;
		annualInterestRate = c;
		dateCreated = new java.util.Date();
	}

	public int getID() {
		return id;
	}

	public void setID(int value) {
		id = value;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double value) {
		balance = value;
	}

	public double getRate() {
		return annualInterestRate;
	}

	public void setRate(double value) {
		annualInterestRate = value;
	}

	public Date getCreationDate() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (this.annualInterestRate / 12);
	}

	public void withdraw(int value) throws InsufficientFundsException {
		if (value <= balance) {
			balance -= value;
		} else {
			double needs = value - balance;
			throw new InsufficientFundsException(needs);
		}

	}

	public void deposit(int value) {
		setBalance(balance + value);
	}

}
