package FanApp;

public class TestFanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1 = new Fan();
		Fan f2 = new Fan(Fan.MEDIUM, true, 8.0, "Blue");
		System.out.println(f1);
		System.out.println(f2);
	}
}

