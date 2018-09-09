package employeeAddDelete;

public class UpdateEmployee {

	/*
	 * Author:Nikhil Yedke
	 * UpdateEmployee class
	 * 
	 */
	private Employee employee;
	
	public UpdateEmployee(Employee employee) {
		// TODO Auto-generated constructor stub
	this.employee = employee;
	}
	
	public Employee updateName(String name) {
		this.employee.setName(name);
		return this.employee;
	}
	
	public Employee updateAddress(String address) {
		this.employee.setAddress(address);
		return this.employee;
	}
	
	public Employee updateMobNo(String mobNo) {
		this.employee.setMobNo(mobNo);
		return this.employee;
	}
	
	public Employee updateEmpId(int empId) {
		this.employee.setEmpID(empId);
		return this.employee;
	}
	
	

}
