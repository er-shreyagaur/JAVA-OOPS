package abstract_class;

abstract class Dog extends Animal {
	public abstract void breedInfo(); // Abstract Method

	public void wagTail() { // Concrete Method
		System.out.println("The dog is wagging its tail");
	}
}
