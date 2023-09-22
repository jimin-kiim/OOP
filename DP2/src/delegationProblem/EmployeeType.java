package delegationProblem;

public abstract class EmployeeType {
	double salary;
	
	EmployeeType (double salary) {
		this.salary = salary;
	}
	
	public abstract void increaseSalary(double rate);
}
