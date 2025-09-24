package encapsulation;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop lp = new Laptop();
		lp.setBrand("HP");
		lp.setPrice(58000);
		System.out.println(lp);
		System.out.println("========================");

		Laptop lp2 = new Laptop();
		lp2.setDetails("DELL", 70000);
		System.out.println("Brand is: " + lp2.getBrand());
		System.out.println("Price is: " + lp2.getPrice());

	}
}
