package encapsulation;

public class UserDriver {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("Bob");
		u1.setId(101);
		System.out.println(u1);

		System.out.println("================");

		User u2 = new User();
		u2.setDetails("Charlie", 102);
		System.out.println("User Name : " + u2.getName());
		System.out.println("User Id : " + u2.getId());
	}
}
