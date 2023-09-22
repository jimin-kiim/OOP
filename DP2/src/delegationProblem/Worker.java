package delegationProblem;

public abstract class Worker {
	EmployeeType etype = null;
	public abstract void doWork();	
	public void increaseSalary(double rate) {
		etype.increaseSalary(rate);
	}
}
