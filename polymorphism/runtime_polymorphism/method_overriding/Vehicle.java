package runtime_polymorphism.method_overriding;
import java.util.*;

class Vehicle {
	Vehicle(){
		System.out.println("Details of Vehicles..");
	}
	public void start() {
		System.out.println("Vehicles are started..");
	}
	public void stop() {
		System.out.println("Vehicles are stopped..");
	}
	
}
class Car extends Vehicle{
	Car(){
		super();
	}
	
	@Override
	public void start() {
		System.out.println("Car is started");
	}	
	
	@Override
	public void stop() {
		System.out.println("Car is stopped..");
	}
	
	public void refuelVehicle() {
		System.out.println("Refuel car with petrol or diesel..");
	}
}

class Bike extends Car{
	@Override
	public void start() {
		System.out.println("Bike is started");
	}	
	
	@Override
	public void refuelVehicle() {
		System.out.println("Refuel bike with petrol");
	}
	
	@Override
	public void stop() {
		System.out.println("Bike is stopped..");
	}
}
