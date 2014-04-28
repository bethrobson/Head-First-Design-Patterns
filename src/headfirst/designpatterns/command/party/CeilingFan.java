package headfirst.designpatterns.command.party;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
 
	public CeilingFan(String location) {
		this.location = location;
	}
  
	public void high() {
		// turns the ceiling fan on to high
		speed = HIGH;
		System.out.println(location + " ceiling fan is on high");
	} 

	public void medium() {
		// turns the ceiling fan on to medium
		speed = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}

	public void low() {
		// turns the ceiling fan on to low
		speed = LOW;
		System.out.println(location + " ceiling fan is on low");
	}
 
	public void off() {
		// turns the ceiling fan off
		speed = OFF;
		System.out.println(location + " ceiling fan is off");
	}
 
	public int getSpeed() {
		return speed;
	}
}
