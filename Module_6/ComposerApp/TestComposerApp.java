package ComposerApp;

import java.util.List;
import java.util.Scanner;

/**
 * Entry class to run program.
 */
public class TestComposerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("  Welcome to the Composer App\n");
		ComposerDao memComposerDao = new MemComposerDao();
		
		boolean continueLoop = true;
		while (continueLoop) {
			displayMenu();
			int option = scanner.nextInt();
			if (option == 1) {
				System.out.println("\n  --Displaying Composers--");
				List<Composer> composers = memComposerDao.findAll();
				for (Composer composer: composers) {
					System.out.print(composer);
				}
			} else if (option == 2) {
				System.out.print("\n  Enter an id: ");
				int id = scanner.nextInt();
				Composer composer = memComposerDao.findBy(id);
				System.out.print("\n  --DISPLAY COMPOSER--");
				System.out.print(composer);
			} else if (option == 3) {
				System.out.print("\n  Enter an id: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("  Enter a name: ");
				String name = scanner.nextLine();
				System.out.print("  Enter a genre: ");
				String genre = scanner.nextLine();
				Composer composer = new Composer(id, name, genre);
				memComposerDao.insert(composer);
			} else {
				continueLoop = false;
				System.out.println("\n  End of line...");
			}
		}
	}
	
	/**
	 * Method to display Menu options.
	 */
	public static void displayMenu() {
		String result = "\n  MENU OPTIONS\n" + "    1. View Composers\n" + "    2. Find Composer\n"
				+ "    3. Add Composer\n" + "    4. Exit\n\n" + "  Please choose an option: ";
		System.out.print(result);
	}

}
