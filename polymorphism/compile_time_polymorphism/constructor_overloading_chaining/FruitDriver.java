package compile_time_polymorphism.constructor_overloading_chaining;

public class FruitDriver {
	public static void main(String[] args) {
		
		Fruit F1 = new Fruit("Apple");
		Fruit F2 = new Fruit("Mango","Yellow");
		Fruit F3 = new Fruit("Grapes","green",5);
		F1.getDetails();
		System.out.println("==================");
		F2.getDetails();
		System.out.println("==================");
		F3.getDetails();
	}
}
