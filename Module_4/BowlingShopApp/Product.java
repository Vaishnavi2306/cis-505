package BowlingShopApp;

/**
 * Super class representing a Product.
 */
public class Product {
	private String code = "";
	private String description = "";
	private double price = 0;
	
	Product() {
		
	}
	
	/**
	 * Gets the Code.
	 * @return String
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * Gets the Product Description.
	 * @return String
	 */
	public String getDescription() {
		return description;
	}
	
	/** 
	 * Gets the product Price.
	 * @return double
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Sets the Product code.
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * Sets the product description.
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Sets the product price.
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Overrides the toString() method to return product details.
	 */
	public String toString() {
		String result = "  Product code: " + code + "\n  Description: " + description + "\n  Price: $" + String.format("%,6.2f", price);
		return result;
	}
}
