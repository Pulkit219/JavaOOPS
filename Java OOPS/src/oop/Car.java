package oop;

public class Car extends Vehicle{

	
	private boolean powerStreering = false;
	private boolean ledScreen = true;
	
	public Car(String name, String color, boolean powerStreering, boolean ledScreen ) {
		super(name, color);
		this.ledScreen = ledScreen;
		this.powerStreering = powerStreering;
	}

	public boolean getPowerStreering() {
		return powerStreering;
	}

	public void setPowerStreering(boolean powerStreering) {
		this.powerStreering = powerStreering;
	}

	public boolean getLedScreen() {
		return ledScreen;
	}
	
	public String getName() {
		return "The name is " + super.getName();
	}

	public void setLedScreen(boolean ledScreen) {
		this.ledScreen = ledScreen;
	}
	
	
	

}
