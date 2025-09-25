package runtime_polymorphism.upcasting;

public class Employee {
	String name;
	int id;
	String department;

	Employee(String name, int id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	public void work() {
		System.out.println(name + "is an employee");
	}

	public void showDetails() {
		System.out.println("Id: " + id + "\tName:" + name + "\tDepartment:" + department);
	}
}

class Manager extends Employee {
	int teamSize;
	String projectName;

	Manager(String name, int id, String department, int teamSize, String projectname) {
		super(name, id, department);
		this.teamSize = teamSize;
		this.projectName = projectname;
	}

	@Override
	public void work() {
		System.out.println(name + " is managing project: " + projectName + " with team of " + teamSize);
	}

	public void conductMeeting() {
		System.out.println(name + " is conducting a meeting.");
	}
}
