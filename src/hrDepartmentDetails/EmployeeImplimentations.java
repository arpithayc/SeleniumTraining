package hrDepartmentDetails;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeImplimentations extends EmployeeDetails implements EmployeeFunctionality {
	static EmployeeDetails empDetails;
	public EmployeeDetails CreationOfEMployeeEntry() {
		empDetails = new EmployeeDetails();
		return empDetails;
	}
	@Override
	public void addEmployeeDetails(ArrayList<EmployeeDetails> employeeList) {
		Scanner scanner= new Scanner(System.in); 
		System.out.println("Enter Employee Name: ");
		empDetails.setEmpName(scanner.nextLine());
		System.out.println("Enter Employee Id: ");
		empDetails.setEmpId(scanner.nextInt());
		System.out.println("Enter Employee Experince: ");
		empDetails.setEmpExperience(scanner.nextDouble());
		System.out.println("Enter Employee Salary: ");
		empDetails.setEmpSalary(scanner.nextDouble());
		employeeList.add(empDetails);
	
		
	}

	@Override
	public void selectEmployeeDetails(ArrayList<EmployeeDetails> employeeList) {
		System.out.println("Enter Employee ID");
		Scanner sc= new Scanner(System.in); 
		if(empDetails!=null) {
			System.out.println("Enter Employee Id: ");
		
			if(empDetails.getEmpId() == sc.nextInt()) {
				System.out.println("Enter your Choice :\n 1-Update		2-Delete	3-View	4-Exit");
				int choice = sc.nextInt();
				switch(choice) {
				case 1 : updateEmployeeDetails(employeeList);
				break;
				case 2 : deleteEmployeeDetails( employeeList);
				break;
				case 3 : viewEmployeeDetails(employeeList);
				break;
				case 4 : exitEmployeeDetails(employeeList);;
				break;
				default:System.out.println("Invalid choice");
				}
			}else {
				System.out.println("Enter Emp Id is not present");
			}
		}else 
			{
				System.out.println("Employee details not available");	
			}
		
		}
	

	@Override
	public void viewEmployeeDetails(ArrayList<EmployeeDetails> employeeList) {
		if(empDetails!=null) {
			for(EmployeeDetails empDetails : employeeList) {
				System.out.println("Employee ID : 	"+empDetails.getEmpId());
				System.out.println("Employee Name : 	"+empDetails.getEmpName());
				System.out.println("Employee Experience :	 "+empDetails.getEmpExperience());
				System.out.println("Employee Salary : 	"+empDetails.getEmpSalary());
				
			}
		}else {
			System.out.println("Your deleted employee details No Records to display");
		}
		
		
	}

	@Override
	public void exportEmployeeDetails(ArrayList<EmployeeDetails> employeeList) {
		if(empDetails!=null) {
			for(EmployeeDetails empDetails : employeeList) {
				System.out.println("Employee Report as fallows ");
				System.out.println("----------------------------------------------- ");
				System.out.println("Employee ID : 	"+empDetails.getEmpId());
				System.out.println("Employee Name : 	"+empDetails.getEmpName());
				System.out.println("Employee Experience :	 "+empDetails.getEmpExperience());
				System.out.println("Employee Salary : 	"+empDetails.getEmpSalary());
				System.out.println("----------------------------------------------- ");
			}
		}else {
			System.out.println(" No Records to dispaly please add employee details first then choose export");
		}
		
	}

	@Override
	public void exitEmployeeDetails(ArrayList<EmployeeDetails> employeeList) {
		System.out.println("Exited Thanks for using application");
		
	}

	@Override
	public void updateEmployeeDetails(ArrayList<EmployeeDetails> employeeList) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter Employee Details");
		System.out.println("Employee Experience :");
		empDetails.setEmpExperience(sc.nextDouble());
		System.out.println("Employee Salary :");
		empDetails.setEmpSalary(sc.nextDouble());
	}

	@Override
	public void deleteEmployeeDetails(ArrayList<EmployeeDetails> employeeList) {
		System.out.println("Employee ID " +empDetails.getEmpId()+" is deleted");
		empDetails = null;
	}

}
