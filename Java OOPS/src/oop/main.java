package oop;



public class main {

	public static void main(String[] args) {
		
		Vehicle vehicle1 =new Vehicle("bmw", "white");
		Vehicle vehicle2 =new Vehicle("Porsche", "white");
		System.out.println(vehicle1.color);
		System.out.println(vehicle2.color);
		System.out.println(Vehicle.getdata());
	}

}
