package FanApp;

public class Fan{
	static final int STOPPED=0;
	static final int SLOW=1;
	static final int MEDIUM=2;
	static final int SPEED=3;
		private int speed = STOPPED;
		private boolean fanStatus = false;
		private double radius =6.0;
		private String color ="White";
		public int getspeed() {
			return speed;
		}
		public  boolean getfanSpeed() {
			return fanStatus;
		}
		public double getradius() {
			return radius;
		}
		public String getcolor() {
			return color;
		}
		public void setspeed(int newValue) {
			speed=newValue;
		}
		public void setfanStatus(boolean newValue) {
			fanStatus=newValue;
		}
		public void setradius(double newValue) {
			radius=newValue;
		}
		public void setcolor(String newValue) {
	       color= newValue;
		}
		Fan(){
			
		}
		Fan(int speed ,boolean fanStatus, double radius,String color  ){
			this.speed=speed;
			this.fanStatus=fanStatus;
			this.radius=radius;
			this.color=color;
		}
		public String toString() {
			if(fanStatus) {
				return "The fan speed is set to " + speed + " with a color of " + color + " and a radius of " + radius;
			} else {
				return "The fan is " + color + " with a radius of " + radius + " and the fan is off";
			}
		}
	}
