package employeeAddDelete;

public class Employee {
private String name;
private String address;
private String mobNo;
private int empID;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobNo() {
	return mobNo;
}
public void setMobNo(String mobNo) {
	this.mobNo = mobNo;
}
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public Employee(String name, String address, String mobNo, int empID) {
	super();
	this.name = name;
	this.address = address;
	this.mobNo = mobNo;
	this.empID = empID;
}
public Employee() {
	
}
}
