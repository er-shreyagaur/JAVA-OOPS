package interfaces.functional_interface;

@FunctionalInterface
interface Driveable{
	void drive();
}

public class Vehicle implements Driveable {
	@Override
	public void drive() {
		System.out.println("Vehicle is being driven");
	}
	
}
