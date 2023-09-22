package delegationProblem;

public class Manager extends EmployeeType {
	double salary;
	
	public Manager (double salary) {
		this.salary = salary;
	}
	
	@Override
	public void increaseSalary(double rate) {
		salary += 10;
		salary += salary * rate;
		
	}
	
}
