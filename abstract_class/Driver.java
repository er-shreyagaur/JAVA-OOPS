package abstract_class;

public class Driver {
	public static void main(String[] args) {
		Animal a1 = new Labrador();
		a1.sound();
		a1.sleep();
		
		Dog d1 = (Dog) a1;
		d1.breedInfo();
		d1.wagTail();
	}
}
