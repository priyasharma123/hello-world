package employeeAddDelete;

public class UtilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Nikhil","Panchavati Katol","8149",10645846);
		System.out.println(" emp1 => " + emp1 );
		UpdateEmployee upEmp1 = new UpdateEmployee(emp1);
		upEmp1.updateAddress("Kamptee");
		upEmp1.updateName("Priya Sharma");
		upEmp1.updateMobNo("8806");
		emp1 = upEmp1.updateEmpId(10645946);
		System.out.println(" update emp => " + emp1);
		DeleteEmployee deletedEmployee = new DeleteEmployee(emp1);
		emp1 = deletedEmployee.deleteEmployee();
		System.out.println(" emp1 =>" + emp1);
	
		
		
	}

}
