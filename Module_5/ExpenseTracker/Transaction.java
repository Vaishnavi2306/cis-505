package ExpenseTracker;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Class to represent a T
 */
public class Transaction {
	private String date;
	private String description;
	private double amount;

	Transaction() {
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		this.date= currentDate.format(formatter);
		this.description = "";
	    this.amount = 0.0;
	}
	
	Transaction(String description, double amount) {
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		this.date= currentDate.format(formatter);
		this.description=description;
		this.amount=amount;
	}
	
	Transaction( String date, String description, double amount) {
		this.date=date;
		this.description=description;
		this.amount=amount;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date=date;
	}
	
	public String getDescription() {
		return description;
	}
	
	public  void setDescription(String description) {
		this.description = description;
	}
	
	 public double getAmount() {
		 return amount;
	 }
	 
	 public void setAmount(double amount) {
		 this.amount = amount;
	 }
	 
	public String toString() {
		return "  Date: " + date + "\n  Description: " + description + "\n  Amount: $" + String.format("%,6.2f", amount) + "\n\n";
	}
	
}
