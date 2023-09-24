package BowlingShopApp;

/**
 * Shoe class representing a kind of product.
 */
public class Shoe extends Product{
	private double size = 0;
	
	Shoe() {
		
	}
	
	/**
	 * Gets the Size.
	 * @return double
	 */
	public double getSize() {
		return size;
	}
	
	/**
	 * Sets the size.
	 * @param size
	 */
	public void setSize(double size) {
		this.size = size;
	}
	
	/**
	 * Overrides the toString() method to return Shoe details.
	 */
	public String toString() {
		String result = super.toString() + "\n  Size: " + size + "\n\n";
		return result;
	}
}
