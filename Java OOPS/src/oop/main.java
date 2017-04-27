package oop;



public class main {

	public static void main(String[] args) {
		
		
		Vehicle vehicle1 =new Vehicle("bmw", "white");
		Vehicle vehicle2 =new Vehicle("Porsche", "white");
		System.out.println(vehicle1.getColor());
		System.out.println(vehicle2.getColor());
		//use of static function, which can be accessible without the use of any object 
		System.out.println(Vehicle.getdata());
		//use of static variable, which can be accessible without the use of any object 
		System.out.println(Vehicle.i);
	}

}
