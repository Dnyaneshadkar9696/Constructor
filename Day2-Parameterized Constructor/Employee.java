package constructor.day2;

public class Employee {

	int empId;
	String empName;
	double empSalary;

	public Employee(int empId, String empName, double empSalary) {

		// TODO Auto-generated constructor stub

		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;

	}
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("    *****Employee Information***** ");
	}


	public void empInfo() {
		
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Salary: " + empSalary);

	}

}
