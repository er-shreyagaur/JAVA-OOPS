package interfaces.normal_interface;

class ElectricCar implements Car {
	@Override
	public void start() {
		System.out.println("Electric Car");
	}

	@Override
	public void stop() {
		System.out.println("Stop Electric Car");
	}

	@Override
	public void openGate() {
		System.out.println("Open Gate in electric car");
	}
}
