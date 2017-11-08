package VehicleExample;

public class Vehicle {

	// Data member
	private String color;

	private Double currentSpeed;

	// Constructors
	public Vehicle() {
		color = "red";
		currentSpeed = 0.0;
	}

	public Vehicle(String color, Double currentSpeed) {
		this.color = color;
		this.currentSpeed = currentSpeed;
	}

	// Member functions
	public void accelerate(int amount) {
		currentSpeed += amount;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public String getColor() {
		return color;
	}

}
