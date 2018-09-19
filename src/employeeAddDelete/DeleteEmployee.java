package employeeAddDelete;

public class DeleteEmployee {

	private Employee employee;

	public DeleteEmployee(Employee employee) {
		super();
		this.employee = employee;
	}
	public Employee deleteEmployee() {
		this.employee=new Employee("null","null","null",0);
		return this.employee;
	}
}
