package humanResources;

public class Employee extends Staff implements ICalculator {
	private int overtime;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	//constructor
	public Employee(String id, String name, int age, double salaryCoefficient, String startDate, String department,
			int daysOff, int overtime) {
		super(id, name, age, salaryCoefficient, startDate, department, daysOff);
		this.overtime = overtime;
		// TODO Auto-generated constructor stub
	}
	
	
	//getter and setter
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
	

	@Override
	public String toString() { //implements toString() of superclass
		// TODO Auto-generated method stub
		return String.format("%-10s%-20s%-20d%-20.2f%-20s%-20s%-20d%-20d", id, name, age, salaryCoefficient,startDate, department, daysOff, overtime);
	}
	
}
