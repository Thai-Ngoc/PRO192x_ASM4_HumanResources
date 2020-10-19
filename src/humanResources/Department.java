package humanResources;
import java.util.*;
public class Department {
	private String departmentID; //ID of departments
	private String departmentName; //name of departments
	private int numStaff; //number of staffs
	
	//constructor
	public Department(String departmentID, String departmentName, int numStaff) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.numStaff = numStaff;
	}

	//getters setters
	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNumStaff() {
		return numStaff;
	}

	public void setNumStaff(int numStaff) {
		this.numStaff = numStaff;
	}
	
	public String toString() {
		return String.format("%-10s%-15s%-10s", departmentID, departmentName, numStaff);
	}
}
