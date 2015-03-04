import java.util.Date;

public class Test {
	
	public Date today;
	
	public static void main(String[] args){
		
		Account account = new Account(1122, 20000., 4.5);
		System.out.print("Depositing $3000...");
		account.deposit(3000);
		try{
			System.out.print("\nWithdrawing $2500...");
			account.withdraw(2500);
		}catch (InsufficientFundsException ex)
		{
			System.out.print("Sorry, but you are short $" + ex.getAmount());
		}
		
		System.out.print("\nBalance is " + account.getBalance());
	}
}

	
