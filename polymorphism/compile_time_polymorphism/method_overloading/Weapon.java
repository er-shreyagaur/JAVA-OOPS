package compile_time_polymorphism.method_overloading;

public class Weapon {
	String name;
	double weight;
	int range;

	public void weaponDetails(String name) {
		System.out.println("Name of Weapon: " + name);
	}

	public void weaponDetails(String name, double weight) {
		System.out.println("Name of Weapon:" + name + "\nWeight of Weapon: " + weight);
	}

	public void weaponDetails(String name, double weight, int range) {
		System.out.println("Name of Weapon:" + name + "\nWeight of Weapon: " + weight + "\nRange of weapon: " + range);
	}

}
