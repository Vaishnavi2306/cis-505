package CustomerAccountApp;

/**
 * Customer DB class which hold and gets the customer data.
 */
public class CustomerDB {
	
	/**
	 * Gets the customer object based on the unique id.
	 * @param id 
	 * @return customer object.
	 */
	public static Customer getCustomer(int id) {
		if (id == 1007) {
			return new Customer("John", "14 MillCreek", "Seattle", "90123");
		}
		else if (id == 1008) {
			return new Customer("Mike", "20 Coington", "Chicago", "89564");
		}
		else if (id == 1009) {
			return new Customer("Smith", "44th dr se", "Bothell", "98012");
		} 
		else {
			return new Customer();
		}
	}
}