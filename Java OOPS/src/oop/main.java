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
		//car class object creation
		Car car1 = new Car("ferari" , "blue", true , false );
		car1.setLedScreen(true);
		
		System.out.println(car1.getLedScreen());
		//by dafault its is calling the overwritten method
	System.out.println(car1.getName());
		
		
	}

}
