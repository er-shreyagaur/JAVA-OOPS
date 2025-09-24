package encapsulation;

public class Laptop {
	private String brand;
	private int price;

	// * getters() for brand
	public String getBrand() {
		return brand;
	}

	// * setters() for brand
	public void setBrand(String brand) {
		this.brand = brand;
	}

	// * getters() for price
	public int getPrice() {
		return price;
	}

	// * setters() for price
	public void setPrice(int price) {
		this.price = price;
	}

	public void setDetails(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Brand : " + brand + "\nPrice : " + price;
	}
}
