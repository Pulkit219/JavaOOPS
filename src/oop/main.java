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
		Bike bike1 = new Bike("ninja", "red");
		car1.setLedScreen(true);
		
		System.out.println(car1.getLedScreen());
		//by default its is calling the overwritten method
	System.out.println(car1.getName());
		System.out.println(bike1.getSum(4, 6));
		
	}

}
