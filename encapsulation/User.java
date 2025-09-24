package encapsulation;

public class User {
	private String name;
	private int id;

	// * getters() for name
	public String getName() {

		return name;
	}

	// * setters() for name
	public void setName(String name) {
		this.name = name;
	}

	// * getters() for id
	public int getId() {
		return id;
	}

	// * setters() for ID
	public void setId(int id) {
		this.id = id;
	}

	public void setDetails(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "User Name is: " + name + "\nUser ID is: " + id;
	}
}
