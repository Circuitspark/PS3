import java.util.Calendar;


public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Calendar dateCreated;
	
	public Account(int a, double b, double c, Calendar d){
		id = a;
		balance = b;
		annualInterestRate = c;
		dateCreated = d;
	}
	
	public int getID(){
		return id;
	}
	
	public void setID(int value){
		id = value;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double value){
		balance = value;
	}
	
	public double getRate(){
		return annualInterestRate;
	}
	
	public void setRate(double value){
		annualInterestRate = value;
	}
	
	public Calendar getCreationDate(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return (this.annualInterestRate / 12);
	}
	
	public void withdraw(double value){
		setBalance(balance - value);
	}
	
	public void deposit(double value){
		setBalance(balance + value);
	}
	
}
