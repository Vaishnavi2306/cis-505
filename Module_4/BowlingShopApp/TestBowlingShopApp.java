package BowlingShopApp;

import java.util.Scanner;

/**
 * This is entry class to test the Bowling application.
 */
public class TestBowlingShopApp {

	/**
	 * Main entry method where program execution begins.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("  Welcome to the Bowling Shop\n");
		
		boolean continueLoop = true;
		while (continueLoop) {
			displayMenu();
			String option = scanner.nextLine();
			if (option.toLowerCase().equals("x")) {
				continueLoop = false;
				System.out.println("\n  End of line...");
				continue;
			}
			System.out.println("\n  --Product Listing--");
			GenericQueue<Product> products = ProductDB.getProducts(option.toLowerCase());
			while (products.size() > 0) {
				Product product = products.dequeue();
				System.out.print(product);
			}
		}
	}
	
	/**
	 * Method to display Menu options.
	 */
	public static void displayMenu() {
		String result = "  MENU OPTIONS\n" + "    1. <b> Bowling Balls\n" + "    2. <a> Bowling Bags\n"
				+ "    3. <s> Bowling Shoes\n" + "    4. <x> To Exit\n\n" + "  Please choose an option: ";
		System.out.print(result);
	}

}
