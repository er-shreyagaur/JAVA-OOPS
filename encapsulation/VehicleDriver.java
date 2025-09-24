package encapsulation;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setColor("Red");
		v1.setWheels(4);
		System.out.println(v1);

		System.out.println("=====================");

		Vehicle v2 = new Vehicle();
		v2.setDetails("White", 3);
		System.out.println("Color of Vehicle: " + v2.getColor());
		System.out.println("Total no. of Wheels: " + v2.getWheels());
	}

}
