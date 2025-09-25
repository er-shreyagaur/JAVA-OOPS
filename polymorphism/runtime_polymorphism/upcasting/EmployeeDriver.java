package runtime_polymorphism.upcasting;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Manager("Alice", 101, "IT", 5, "Blockchain");

		e1.showDetails();
		e1.work();
		System.out.println("===============================================");

		Manager m1 = new Manager("Bob", 102, "IT", 4, "Cyber Security");
		m1.work();
		m1.conductMeeting();
	}
}
