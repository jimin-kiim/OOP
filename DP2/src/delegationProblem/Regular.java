package delegationProblem;

public class Regular extends EmployeeType {
	double salary;
	
	public Regular (double salary) {
		this.salary = salary;
	}

	@Override
	public void increaseSalary(double rate) {
		salary += salary * rate;
	}

}
