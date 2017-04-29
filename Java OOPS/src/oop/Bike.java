package oop;

public class Bike extends Vehicle{
	
	private boolean fourStroke = true;

	public Bike(String name, String color) {
		super(name, color);
		
	}

	public boolean getFourStroke() {
		return fourStroke;
	}

	public void setFourStroke(boolean fourStroke) {
		this.fourStroke = fourStroke;
	}
	
	public String getName() {
		return super.getName();
	}
	public int getSum(int a, int b){
		return a +b;
		
	}

}
