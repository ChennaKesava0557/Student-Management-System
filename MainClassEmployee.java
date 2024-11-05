package Employeee;

import java.util.Scanner;

public class MainClassEmployee {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	EmpDriver ed = new EmpDriver();
	int exp;
	double salary;
	String designation;
	String id;
	boolean start = true;


	
	while(start)
	{
		System.out.println(
				"Enter The Choice : \n1.AddEmployee \n2.Dispaly Is Employee \n3.searchAnEmpBasedExp \n4.serachAnEmpBaseedOnSalAndJob\n5.updateEmpSalaryBasedOnExp\n6.updateCompanyNameBasedOnSalary\n7.removeEmpBasedOnid \n8.Exit");

		int ch = sc.nextInt();
		switch (ch) {
		case 1: {
			System.out.println("Enter Employee Name Is:");
			String name = sc.next();
			System.out.println("Enter The Id");
			String id1 = sc.next();
			System.out.println("Enter the Employee Salary");
			double salary1 = sc.nextDouble();
			System.out.println("Enter the Employee Exprince");
			int exp1 = sc.nextInt();
			System.out.println("Enter the Location");
			String loaction = sc.next();
			System.out.println("Enter the Company Name");
			String companyName = sc.next();
			System.out.println("Enter the designation");
			String designation1 = sc.next();
			while (true) {
				try {
					ed.addEmployee(new Employee(name, id1, salary1, exp1, loaction, companyName, designation1));
					break;
				} catch (InvaliedNameException e) {
					System.out.println("Re-Enter The Employee Name");
					name = sc.next();
				} catch (SalaryOutOfBoundExpetion e1) {
					System.out.println("Re-Enter the Salary ");
					salary1 = sc.nextDouble();

				} catch (ExpOutOfBoundExpeetion e2) {
					System.out.println("Enter The Exp");
					exp1 = sc.nextInt();
				} catch (LocationInvaliedException e3) {
					System.out.println("Re-Enter The Loaction");
					loaction = sc.next();
				} catch (InvaliedCompanyNameException e4) {
					System.out.println("re-Enter the Comapany Name");
					companyName = sc.next();

				} catch (InvalieddesignationException e5) {
					System.out.println("Re-Enter The Designation");
					designation1 = sc.next();

				}
				catch(InvaliedIDExpetion e6)
				{
					System.out.println("Re-Enter The ID");
					id1=sc.next();
				}
			}
		}
			break;
		case 2: {
			System.out.println("Employee Detioes.....!");
			ed.displayEmployee();
		}
			break;
		case 3: {
			while (true) {
				try {
					System.out.println("Enter The Employee Exprince");
					exp = sc.nextInt();
					ed.searchAnEmpBasedExp(exp);
					break;
				} catch (ExpOutOfBoundExpeetion e4) {

				}
			}
		}
			break;
		case 4: {
			while (true) {
				try {
					System.out.println("Enter The Employee Salary ..!");
					salary = sc.nextDouble();
					System.out.println("Enter The designation");
					designation = sc.next();
					ed.serachAnEmpBaseedOnSalAndJob(salary, designation);
					break;
				} catch (SalaryOutOfBoundExpetion e) {

				} catch (InvalieddesignationException e) {

				}
			}
		}

			break;
		case 5: {
			while (true) {
				try {
					System.out.println("Enter Employee Exp ");
					exp = sc.nextInt();
					System.out.println("Enter The New Salary");
					salary = sc.nextDouble();
					ed.updateEmpSalaryBasedOnExp(exp, salary);
					break;
				} catch (ExpOutOfBoundExpeetion e) {

				} catch (SalaryOutOfBoundExpetion e1) {

				}

			}

		}
			break;

		case 6: {
			while (true) {
				try {
					System.out.println("Enter The Employee Salary");
					salary = sc.nextInt();
					System.out.println("Enter The New Comapany");
					designation = sc.next();

					ed.updateCompanyNameBasedOnSalary(salary, designation);
					break;
				} catch (ExpOutOfBoundExpeetion e) {

				} catch (SalaryOutOfBoundExpetion e1) {

				}
			}

		}

			break;

		case 7: {
			while (true) {
				try {
					System.out.println("Enter the Id");
					id = sc.next();
					ed.removeEmpBasedOnid(id);
					break;
				} catch (InvaliedNameException e) {

				}

			}
		}
			break;
		case 8: {
			System.out.println("Thank You .......!!!!!");
		}

		}
	}

}

}
