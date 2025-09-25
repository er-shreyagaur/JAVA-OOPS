package compile_time_polymorphism.constructor_overloading_chaining;

public class Fruit {

	String name;
	String color;
	int weight;

	Fruit() {
		System.out.println("Default constructor made");
	}

	Fruit(String name) {
		this();
		this.name = name;
	}

	Fruit(String name, String color) {
		this(name);
		this.color = color;
	}

	Fruit(String name, String color, int weight) {
		this(name, color);
		this.weight = weight;
	}

	public void getDetails() {
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Weight: " + weight + " kg");
	}

}
