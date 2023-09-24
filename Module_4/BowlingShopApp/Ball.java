package BowlingShopApp;

/**
 * Ball class representing a kind of product.
 */
public class Ball extends Product {
	private String color = "";
	
	Ball() {
		
	}
	
	/**
	 * Gets the Ball color.
	 * @return String
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Sets the Ball color.
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Overrides the toString() method to return Ball details.
	 */
	public String toString() {
		String result = super.toString() + "\n  color: " + color + "\n\n";
		return result;
	}
}
