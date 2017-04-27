package oop;

public class Vehicle {

	public String color;
	public String name;
	
	
	 public Vehicle(String name, String color){
		this.color = color;
		this.name = name;
		
	}



public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}

public static String getdata(){
	return ("example of static function");
}


}
