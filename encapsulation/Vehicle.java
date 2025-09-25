package encapsulation;

public class Vehicle {
	private String color;
	private int wheels;

	// * getters() method for color
	public String getColor() {
		return color;
	}

	// * setters() method for color
	public void setColor(String color) {
		this.color = color;
	}

	// * getters() method for wheels
	public int getWheels() {
		return wheels;
	}

	// * setters() method for wheels
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public void setDetails(String color, int wheels) {
		this.color = color;
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Color :" + color + "\nWheels: " + wheels;
	}
}
