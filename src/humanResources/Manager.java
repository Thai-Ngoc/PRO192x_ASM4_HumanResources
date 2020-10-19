package humanResources;
import java.util.*;
public class Manager extends Staff implements ICalculator {
	Scanner in = new Scanner(System.in);
	
	private String position;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, int age, double salaryCoefficient, String startDate, String department,
			int daysOff, String position) {
		super(id, name, age, salaryCoefficient, startDate, department, daysOff);
		// TODO Auto-generated constructor stub
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		double managerSalary = 0;
		if(getPosition().equalsIgnoreCase("Business Leader")) {
			managerSalary = getSalaryCoefficient() * 5000000 + 8000000;
		} else if(getPosition().equalsIgnoreCase("Project Leader")) {
			managerSalary = getSalaryCoefficient() * 5000000 + 5000000;
		} else if(getPosition().equalsIgnoreCase("Technical Leader")) {
			managerSalary = getSalaryCoefficient() * 5000000 + 6000000;
		}
		return managerSalary;
	}

	List<Manager> manager = new ArrayList<>();
	
	public void addManager() {
		System.out.println("Enter information of the new manager");
		System.out.print("ID: ");
		String id = "";
		while(in.hasNext()) {
			id = in.next();
			if(checkID(id)) {
				break;
			} else {
				System.out.println("This ID has already existed, please create another ID ");
			}
		}
		System.out.print("Name: ");
		String name = in.nextLine();
		System.out.print("Age: ");
		int age = intCheck();
		System.out.print("Salary coefficient: ");
		double salaryCoefficient = in.nextDouble();
		System.out.print("Start date: ");
		String startDate = in.nextLine();
		System.out.print("Department: ");
		String departmentID = in.nextLine();
		System.out.print("Number of days off: ");
		int daysOff = intCheck();
		System.out.print("Position: ");
		String position = in.nextLine();
	}

	boolean checkID(String s) {
		for(Manager aMan : manager) {
			if(aMan.getId().equalsIgnoreCase(s)) {
				return false;
			}
		}
		return true;
	}
	public void addToList(String id, String name, int age, double salaryCoefficient, String startDate, String department,
			int daysOff, String position) {
		Manager newMan = new Manager(id, name, age, salaryCoefficient, startDate, department, daysOff, position);
		manager.add(newMan);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-10s%-20s%-20d%-20.2f%-20s%-20s%-20d%-20s", id, name, age, salaryCoefficient,startDate, department, daysOff, position);
	}
	
	public void displayManager() {
		System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "ID", "Name", "Age", "Salary coefficient", "Start date", "Department", "Days off", "Position");
		for(Manager aMan : manager) {
			System.out.println(aMan.toString());
		}
		System.out.println();
	}
	

}
