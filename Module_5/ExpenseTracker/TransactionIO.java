package ExpenseTracker;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    private static final String FILE_NAME = "expenses.txt";
    private static final File file = new File(FILE_NAME);

    /**
     * Adds all the transactions to the File. 
     * @param transactions
     * @throws IOException
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;

        try {
            if (file.exists()) {
                output = new PrintWriter(new FileOutputStream(file, true));
            } else {
                output = new PrintWriter(FILE_NAME);
            }

            for (Transaction tran : transactions) {
                output.print(tran.getDate() + " ");
                output.print(tran.getDescription() + " ");
                output.println(tran.getAmount());
            }
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    /**
     * Gets the Transactions from the File.
     * @return ArrayList<Transaction>
     * @throws IOException
     */
    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String date = input.next();
                String description = input.next();
                double amount = input.nextDouble();
                Transaction transaction = new Transaction(date, description, amount);
                transactions.add(transaction);
            }
        }

        return transactions;
    }
}
