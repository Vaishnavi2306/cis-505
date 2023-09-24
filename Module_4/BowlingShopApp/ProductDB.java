package BowlingShopApp;

/**
 * ProductDb class holding products data.
 */
public class ProductDB {
	
	/**
	 * Gets the list of Products based on code.
	 * @param code
	 * @return GenericQueue<Product>
	 */
	public static GenericQueue<Product> getProducts(String code) {
		if (code.equals("b")) {
			Ball ball1 = new Ball();
			ball1.setCode("B500");
			ball1.setDescription("Phaze III");
			ball1.setPrice(154.99);
			ball1.setColor("Purple and Green");
			
			Ball ball2 = new Ball();
			ball2.setCode("B400");
			ball2.setDescription("Force Unleashed");
			ball2.setPrice(139.99);
			ball2.setColor("Red and White");
			
			Ball ball3 = new Ball();
			ball3.setCode("B300");
			ball3.setDescription("Proton Physix");
			ball3.setPrice(174.95);
			ball3.setColor("Pink and Purple");
			
			Ball ball4 = new Ball();
			ball4.setCode("B200");
			ball4.setDescription("Axiom Pearl");
			ball4.setPrice(154.95);
			ball4.setColor("Blue and Red");
			
			Ball ball5 = new Ball();
			ball5.setCode("B100");
			ball5.setDescription("Black Widow 2.0");
			ball5.setPrice(144.95);
			ball5.setColor("Black and Red");
			
			GenericQueue<Product> balls = new GenericQueue<Product>();
			balls.enqueue(ball1);
			balls.enqueue(ball2);
			balls.enqueue(ball3);
			balls.enqueue(ball4);
			balls.enqueue(ball5);
			
			return balls;
		}
		else if (code.equals("a")) {
			Bag bag1 = new Bag();
			bag1.setCode("A300");
			bag1.setDescription("Silver/Royal Blue");
			bag1.setPrice(74.99);
			bag1.setType("Triple");
			
			Bag bag2 = new Bag();
			bag2.setCode("A200");
			bag2.setDescription("Prime Roller Black/Royal Blue");
			bag2.setPrice(54.99);
			bag2.setType("Double");
			
			Bag bag3 = new Bag();
			bag3.setCode("A100");
			bag3.setDescription("Path Pro Deluxe");
			bag3.setPrice(34.99);
			bag3.setType("Single");
			
			GenericQueue<Product> bags = new GenericQueue<Product>();
			bags.enqueue(bag1);
			bags.enqueue(bag2);
			bags.enqueue(bag3);
			
			return bags;
		}
		else if (code.equals("s")) {
			Shoe shoe1 = new Shoe();
			shoe1.setCode("S500");
			shoe1.setDescription("Youth Skull Green/Black");
			shoe1.setPrice(39.99);
			shoe1.setSize(3.0);
			
			Shoe shoe2 = new Shoe();
			shoe2.setCode("S400");
			shoe2.setDescription("Men's Tribal White");
			shoe2.setPrice(26.99);
			shoe2.setSize(8.5);
			
			Shoe shoe3 = new Shoe();
			shoe3.setCode("S300");
			shoe3.setDescription("Women's Path Lite Seamless Mesh");
			shoe3.setPrice(54.99);
			shoe3.setSize(6.0);
			
			Shoe shoe4 = new Shoe();
			shoe4.setCode("S200");
			shoe4.setDescription("Women's Rise Black/Hot Pink");
			shoe4.setPrice(39.99);
			shoe4.setSize(10.5);
			
			Shoe shoe5 = new Shoe();
			shoe5.setCode("S100");
			shoe5.setDescription("Men's Ram Black");
			shoe5.setPrice(39.99);
			shoe5.setSize(10.5);
			
			GenericQueue<Product> shoes = new GenericQueue<Product>();
			shoes.enqueue(shoe1);
			shoes.enqueue(shoe2);
			shoes.enqueue(shoe3);
			shoes.enqueue(shoe4);
			shoes.enqueue(shoe5);
			
			return shoes;
		}
		else {
			return new GenericQueue<Product>();
		}
	}
}
