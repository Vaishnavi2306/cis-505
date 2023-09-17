package CustomerAccountApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Class defines account properties and methods to deposit, withdraw and see balance.
 */
public class Account {
	private double balance = 200;
	
	/**
	 * Gets the balance amount present in the account
	 * @return  balance amount present
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Deposits the given amount into the account.
	 * @param amt
	 */
	public void deposit(double amt) {
		balance = balance + amt;
	}
	
	/**
	 * Withdraws the given amount from the account.
	 * @param amt
	 */
	public void withdraw(double amt) {
		if (balance >= amt) {
			balance = balance - amt;
		}
	}
	
	/**
	 * Displays the menu to the user related to the account.
	 */
	public void displayMenu() {
		String printMessage = "  Account Menu\n" + "  Enter <D/d> for deposit\n" + "  Enter <W/w> for withdraw\n" + 
	"  Enter <B/b> for balance\n" + "    Enter option>: ";
		System.out.print(printMessage);
	}
	
	/**
	 * Gets the current transaction date.
	 * @return string representing data in MM-dd-yyyy format.
	 */
	public String getTransactionDate() {
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return currentDate.format(formatter);

	}
}

