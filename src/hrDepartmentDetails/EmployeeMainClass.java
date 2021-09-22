package hrDepartmentDetails;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMainClass {
	public static void main(String args[]) {
		ArrayList<EmployeeDetails> employeeList = new ArrayList <EmployeeDetails>();
		EmployeeImplimentations empDetailsMain = new EmployeeImplimentations();
		System.out.println("Welcome to employee Management tool");
		System.out.println("---------------------------------------");
		switchCasesRecursion(empDetailsMain,employeeList);
		
	}
	public static void switchCasesRecursion(EmployeeImplimentations empDetailsMain, ArrayList<EmployeeDetails> employeeList) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter your Choice :\n 1-Add		2-Select	3-View		4-Export	5-Exit");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 : empDetailsMain.CreationOfEMployeeEntry();
		empDetailsMain.addEmployeeDetails(employeeList);
		switchCasesRecursion(empDetailsMain,employeeList);
		break;
		case 2 : empDetailsMain.selectEmployeeDetails(employeeList);
		switchCasesRecursion(empDetailsMain,employeeList);
		break;
		case 3 : empDetailsMain.viewEmployeeDetails(employeeList);
		switchCasesRecursion(empDetailsMain,employeeList);
		break;
		case 4 : empDetailsMain.exportEmployeeDetails(employeeList);
		switchCasesRecursion(empDetailsMain,employeeList);
		break;
		case 5 : empDetailsMain.exitEmployeeDetails(employeeList);
		break;
		default:System.out.println("Invalid choice please enter valid choice");
		switchCasesRecursion(empDetailsMain,employeeList);
		}
	}
}
