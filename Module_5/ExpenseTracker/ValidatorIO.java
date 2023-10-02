package ExpenseTracker;
import java.util.Scanner;

public class ValidatorIO {
	
	/**
	 * Gets the integer from Scanner and validates it. 
	 * @param sc
	 * @param prompt
	 * @return
	 */
	public static int  getInt (Scanner sc, String prompt) {
		int input =0;
		boolean isVaild = false;
		while(!isVaild) {
			System.out.print(prompt);
			
			if (sc.hasNextInt())
			{
				input = sc.nextInt();
				isVaild = true;
		    }
			else
			{
				System.out.println("\n  Error! integer value.\n");
			}
			sc.nextLine();	
		}
		return input;	
	}
		
	/**
	 * Gets the double from the scanner and validates it.
	 * @param sc
	 * @param prompt
	 * @return
	 */
	public static double getDouble ( Scanner sc, String prompt) {
		double input =0;
		boolean isVaild = false;
		while(!isVaild) 
		{
			System.out.print(prompt);
			
			if (sc.hasNextDouble())
			{
				input = sc.nextDouble();
				isVaild = true;
		   }
			else
			{
				System.out.println("\n Error! integer value.\n");
			}
			sc.nextLine();				
		}
		return input;	
	}
	
	/**
	 * Gets the enetered string from scanner.
	 * @param sc
	 * @param prompt
	 * @return
	 */
	public static String getString (Scanner sc, String prompt) {
		System.out.print(prompt);
		String input = sc.next();
		return input;
	}
		
}