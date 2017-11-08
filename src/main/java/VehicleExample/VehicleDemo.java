package VehicleExample;

/**
 * Example of simple vehicle
 */
public class VehicleDemo {

	public static void main(String[] args) {
		// Create a new object of type Vehicle
		Vehicle vehicle = new Vehicle();
		vehicle.accelerate(1);
		System.out.println("The vehicle is going " + vehicle.getCurrentSpeed() + " mile(s)/hour");
	}
}
