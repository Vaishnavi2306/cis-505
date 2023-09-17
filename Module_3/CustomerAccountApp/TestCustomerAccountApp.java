package CustomerAccountApp;

import java.util.Scanner;

/**
 * This is entry class to test the customer account application.
 */
public class TestCustomerAccountApp {
	
	/**
	 * Main entry method where program execution begins.
	 * @param args
	 */
	public static void main(String[ ] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("  Welcome to the Customer Account App\n");
		System.out.println("  Enter a customer ID:");
		System.out.print("    ex: 1007, 1008, 1009>: ");
		int id = scanner.nextInt();
		System.out.print("\n");
		scanner.nextLine(); // Consume the newline character
		Customer customer = CustomerDB.getCustomer(id); 

		Account account = new Account();

		boolean continueLoop = true;
		while (continueLoop) {
			account.displayMenu();
			String option = scanner.nextLine();
			if (option.toLowerCase().equals("d")) {
				System.out.print("  Enter deposit amount: ");
				double depositAmount = scanner.nextDouble();
				account.deposit(depositAmount);
			}
			else if (option.toLowerCase().equals("w")) {
				System.out.print("  Enter withdraw amount: ");
				double withdrawAmount = scanner.nextDouble();
				account.withdraw(withdrawAmount);
			}
			else if (option.toLowerCase().equals("b")) {
				System.out.println("  Account balance: $" + account.getBalance());
			}
			else {
				System.out.println("  Error: Invalid option");
			}
			System.out.println("  Continue? (y/n): ");
			String next = scanner.nextLine().toLowerCase();
			if (next.equals("n")) {
				continueLoop = false;
				System.out.print("\n");
				System.out.println("  --Customer Details--");
				System.out.println(customer);
				System.out.print("\n");
				
				System.out.printf("  Balance as of " + account.getTransactionDate() + " is $%,6.2f%n", account.getBalance());
				
				System.out.println("\n End of line...");
			}
		}
	}

}
