package Employeee;

import java.util.ArrayList;
import java.util.ListIterator;

public class EmpDriver {
	private Employee e;
	ArrayList<Employee> employee = new ArrayList<Employee>();

	public void addEmployee(Employee e)

	{
		employee.add(e);
		System.out.println("Employee Add Sucessfullly");
	}

	public void displayEmployee() {
		if (employee.isEmpty()) {
			System.out.println("No Emplyee Are Present");
		} else {
			for (Employee e : employee) {
				e.dispaly();
			}

		}

	}

	// serachEmployee Based On Exprince
	public void searchAnEmpBasedExp(int employeeExp) {
		boolean isFound = false;
		if (employee.isEmpty()) {
			System.out.println("No Emplyee Are present ");
		} else 
		{
			for (Employee e : employee) {
				if (e.getEmployeeExp() == employeeExp)

				{
					System.out.println("Company Name Is" + e.getEmployeeCampanyName());
					System.out.println("Employee Salary Is " + e.getEmployeeSalary());
					System.out.println("Employee Is Is " + e.getEmployeeId());
					isFound = true;
				} 
				

			}

		}
		if (isFound == false) {
			System.out.println("Employee is Not Found your enter invlied Data");
			throw new ExpOutOfBoundExpeetion();

		}

	}

	public void serachAnEmpBaseedOnSalAndJob(double employeeSalary, String designation) {
		boolean isjob = false;
		boolean isFound = false;
		if (employee.isEmpty()) {
			System.out.println(" No Emplyee Are Present ");
		} else {
			for (Employee e : employee) {
				if (e.getEmployeeSalary() == employeeSalary || e.getDesignation().equalsIgnoreCase(designation)) {
					System.out.println("Employee Id Is " + e.getEmployeeId());
					System.out.println("Employee CompanyName Is:" + e.getEmployeeCampanyName());
					isFound = true;
					isjob = true;
				}
			}
		}
		if (isFound == false) {
			System.out.println("Employee is Not Found your enter invlied Data");
			throw new SalaryOutOfBoundExpetion();

		}
		if (isjob == false) {
			System.out.println("Employee is Not Found your enter invlied Data");
			throw new InvalieddesignationException();

		}

	}

	// update
	public void updateEmpSalaryBasedOnExp(int employeeExp, double newemplyeeSlary) {
		boolean isexp = false;
		boolean isSalary = false;
		if (employee.isEmpty()) {
			System.out.println("No Emplyee Are Present");
		} else {
			for (Employee e : employee) {
				if (e.getEmployeeExp() == employeeExp) {

					e.setEmployeeSalary(newemplyeeSlary);

					isexp = true;
					isSalary = true;
					System.out.println("Update SucesFully");
				}
			}
		}
		if (isexp == false) {
			System.out.println("Emplyee Is Not Found....! your Entered inavlied Data");
			throw new ExpOutOfBoundExpeetion();

		}
		if (isSalary == false) {
			System.out.println("Emplyee Is Not Found....! your Entered inavlied Data");
			throw new SalaryOutOfBoundExpetion();

		}

	}

	public void updateCompanyNameBasedOnSalary(double employeeSalary, String newComapany) {
		boolean isSalary = false;
		boolean isCompany = false;
		if (employee.isEmpty()) {
			System.out.println("No Emplyee Are Present");
		} else {
			for (Employee e : employee) {
				if (e.getEmployeeSalary() == employeeSalary) {
					e.setEmployeeCampanyName(newComapany);
					isSalary = true;
					isCompany = true;
				}

			}
		}
		if (isSalary == false) {
			System.out.println("Emplyee Is Not Found....! your Entered inavlied Data");
			throw new SalaryOutOfBoundExpetion();

		}
		if (isCompany == false) {
			System.out.println("mplyee Is Not Found....! your Entered inavlied Data");
			throw new InvaliedCompanyNameException();

		}

	}

	// remove
	public void removeEmpBasedOnid(String id) {
		ListIterator<Employee> li = employee.listIterator();
		boolean isRemoved = false;
		if (employee.isEmpty()) {
			System.out.println("No Emplyee Are Present");
		} else {
			while (li.hasNext()) {
				Employee e = li.next();
				if (e.getEmployeeId().equalsIgnoreCase(id)) {
					li.remove();
					System.out.println("Employee Id Removed");
					isRemoved = true;
				}

			}

		}
		if (isRemoved == false) {
			System.out.println("Employee Is Not Removed ..!  Your InValied Data");
			throw new InvaliedNameException();

		}

	}
}
