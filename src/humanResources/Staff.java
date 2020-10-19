package humanResources;
import java.util.*;
public abstract class Staff {
	
	Scanner in = new Scanner(System.in);
	
	int intCheck() {
        //Require to enter an integer
        int input = 0;
        boolean check = false;
        while (!check) {
            if (in.hasNextInt()) {
                input = in.nextInt();
                check = true;
                return input;
            } else {
                System.out.print("Please enter an integer: ");
                check = false;
            }
            in.next();
        } 
        return input;
    }
	
	double doubleCheck() {
		double input = 0;
		boolean check = false;
		while(!check) {
			if(in.hasNextDouble()) {
				input = in.nextDouble();
				check = true;
				return input;
			} else {
				System.out.println("Please enter a decimal: ");
				check = false;
			}
			in.next();
		}
		return input;
	}

	public Staff() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	protected String id, name, startDate, department;
	protected int age, daysOff;
	protected double salaryCoefficient;
	
	public Staff(String id, String name, int age, double salaryCoefficient, String startDate, String department, int daysOff) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salaryCoefficient = salaryCoefficient;
		this.startDate = startDate;
		this.department = department;
		this.daysOff = daysOff;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getDepartmentID() {
		return department;
	}
	public void setDepartmentID(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDaysOff() {
		return daysOff;
	}
	public void setDaysOff(int daysOff) {
		this.daysOff = daysOff;
	}
	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}
	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}
	
	public abstract String toString();
	
}
