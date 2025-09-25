package interfaces.functional_interface;

public class Vehicle implements Runnable {
	Vehicle(){
		
	}
	@Override
	public void run() {
		System.out.println("Run method starts");
	}
	
}
