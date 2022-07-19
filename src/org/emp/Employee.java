package org.emp;

public class Employee {
	public void empId() {
		System.out.println("Employee Id");
	}
	public void empId(String name) {
		System.out.println("Employee Name="+name);
	}
	public void empId(int age) {
		System.out.println("Employee Age="+age);
	}
	public void empId(String email,float salary,long phNo) {
		System.out.println("Employee Email="+email+"\n"+
				"Employee Salary="+salary+"  "+"Employee PhoneNo.="+phNo);
	}
	public void empId(long regNo,float weight,String office) {
		System.out.println("Employee RegNo="+regNo+"\t"
				+"Employee Weight="+weight+"\n"+"Employee Office="+office);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empId("Prakash");
		e.empId(25);
		e.empId("prakash123@gmail.com",30000.2345f,9942654572l);
		e.empId(8220883310l, 67.5f,"CTS");
	}
}
