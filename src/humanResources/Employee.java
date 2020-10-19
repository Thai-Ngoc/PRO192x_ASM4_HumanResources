package humanResources;
import java.util.*;
public class Employee extends Staff implements ICalculator {
	Scanner in = new Scanner(System.in);
	
	private int overtime;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name, int age, double salaryCoefficient, String startDate, String department,
			int daysOff, int overtime) {
		super(id, name, age, salaryCoefficient, startDate, department, daysOff);
		this.overtime = overtime;
		// TODO Auto-generated constructor stub
	}
	
	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return getSalaryCoefficient() * 3000000 + getOvertime() * 200000;
	}
	
	List<Employee> employee = new ArrayList<>();
	
	public void addEmployee() {
		System.out.println("Enter information of the new employee");
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
		System.out.print("Number of overtime hours: ");
		int overtime = intCheck();
	}

	boolean checkID(String s) {
		for(Employee anEm : employee) {
			if(anEm.getId().equalsIgnoreCase(s)) {
				return false;
			}
		}
		return true;
	}
	public void addToList(String id, String name, int age, double salaryCoefficient, String startDate, String department,
			int daysOff, int overtime) {
			Employee newEm = new Employee(id, name, age, salaryCoefficient, startDate, department, daysOff, overtime);
			employee.add(newEm);
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-10s%-20s%-20d%-20.2f%-20s%-20s%-20d%-20d", id, name, age, salaryCoefficient,startDate, department, daysOff, overtime);
	}
	
}
