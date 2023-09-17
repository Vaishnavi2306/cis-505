package CustomerAccountApp;

/**
 * Customer class to represent customer details.
 */
public class Customer {
	    private String name;
	    private String address;
	    private String city;
	    private String zip;

	    /**
	     * Initializes the default customer object.
	     */
		public Customer() {
		}
		
		/**
		 * Initializes the customer object with the given properties.
		 * @param name
		 * @param address
		 * @param city
		 * @param zip
		 */
		public Customer(String name, String address, String city, String zip) {
			this.name = name;
			this.address = address;
			this.city = city;
			this.zip =zip;
		}
		
		/**
		 * Gets the name of customer.
		 * @return string name of customer.
		 */
		public String getName() {
			return name;
		}
		
		/** 
		 * Gets the address of the customer.
		 * @return string address of the customer.
		 */
		public String getAddress() {
			return address;
		}
		
		/**
		 * Gets the city of the customer.
		 * @return string city of the customer.
		 */
		public String getCity() {
			return city;
		}
		
		/**
		 * Gets the zip of the customer.
		 * @return string zip of the customer.
		 */
		public String getZip() {
			return zip;
		}
		
		/**
		 * overrides the ToString method to return string in specific format.
		 */
		public String toString() {
		   return "  Name: " + name + "\n  Address: " + address + "\n  City: " + city + "\n  Zip Code: " + zip;
	    }
	
		}
	
	

