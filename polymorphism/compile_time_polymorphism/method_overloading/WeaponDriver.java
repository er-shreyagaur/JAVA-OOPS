package compile_time_polymorphism.method_overloading;

public class WeaponDriver {
	public static void main(String[] args) {
		Weapon w1 = new Weapon();
		w1.weaponDetails("AK-47");
		System.out.println("==============================");
		w1.weaponDetails("Sword, 1.2");
		System.out.println("==============================");
		w1.weaponDetails("Crossbow, 2.8, 150");

	}
}
