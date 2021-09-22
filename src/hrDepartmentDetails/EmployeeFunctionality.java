package hrDepartmentDetails;

import java.util.ArrayList;

public interface EmployeeFunctionality {
	public abstract void addEmployeeDetails(ArrayList<EmployeeDetails> employeeList);
	public abstract void selectEmployeeDetails(ArrayList<EmployeeDetails> employeeList);
	public abstract void viewEmployeeDetails(ArrayList<EmployeeDetails> employeeList);
	public abstract void exportEmployeeDetails(ArrayList<EmployeeDetails> employeeList);
	public abstract void exitEmployeeDetails(ArrayList<EmployeeDetails> employeeList);
	public abstract void updateEmployeeDetails(ArrayList<EmployeeDetails> employeeList);
	public abstract void deleteEmployeeDetails(ArrayList<EmployeeDetails> employeeList);
}
