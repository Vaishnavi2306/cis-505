package BowlingShopApp;

/**
 * Bag class representing a kind of product.
 */
public class Bag extends Product {
	private String type = "";
	
	Bag() {
		
	}
	
	/**
	 * Gets the Bag type.
	 * @return String
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Sets the Bag type.
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Overrides the toString() method to return Bag details.
	 */
	public String toString() {
		String result = super.toString() + "\n  Type: " + type + "\n\n";
		return result;
	}
}
