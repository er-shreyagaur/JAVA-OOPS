package runtime_polymorphism.method_overriding;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.start();
		v1.stop();
		
		Car c1 = new Bike();
		c1.start();
		c1.refuelVehicle();
	}
}
