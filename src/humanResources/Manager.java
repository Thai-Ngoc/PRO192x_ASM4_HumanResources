package humanResources;

public class Manager extends Staff implements ICalculator {
	private String position;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	
	//constructor
	public Manager(String id, String name, int age, double salaryCoefficient, String startDate, String department,
			int daysOff, String position) {
		super(id, name, age, salaryCoefficient, startDate, department, daysOff);
		// TODO Auto-generated constructor stub
		this.position = position;
	}

	
	//getter and setter
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


	@Override
	public String toString() { //implements toString() of superclass
		// TODO Auto-generated method stub
		return String.format("%-10s%-20s%-20d%-20.2f%-20s%-20s%-20d%-20s", id, name, age, salaryCoefficient,startDate, department, daysOff, position);
	}
}
