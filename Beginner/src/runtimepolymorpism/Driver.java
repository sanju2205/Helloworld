package runtimepolymorpism;

public class Driver {

	public static void main(String[] args) {
		
		GovtEmployee govtEmp1 = new GovtEmployee();
		govtEmp1.getDepartment("11");
		PrivateEmpoyee prvtEmp1 = new PrivateEmpoyee();
		prvtEmp1.getDepartment("2");
		// TODO Auto-generated method stub
		EmployeeService govtEmp = new GovtEmployee();
		govtEmp.getDepartment("11");
		EmployeeService prvtEmp = new PrivateEmpoyee();
		prvtEmp.getDepartment("2");
		

	}

}
