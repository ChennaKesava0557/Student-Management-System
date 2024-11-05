package Employeee;

public class Employee {
	private String employeeName;
	private String employeeId;
	private double employeeSalary;
	private int employeeExp;
	private String employeeloaction;
	private String employeeCampanyName;
	private String designation;

	public Employee() {

	}

	public Employee(String employeeName, String employeeId, double employeeSalary, int employeeExp,
			String employeeloaction, String employeeCampanyName, String designation) {
		if (employeeName.equalsIgnoreCase("chenna") || employeeName.equalsIgnoreCase("sharif")
				|| employeeName.equalsIgnoreCase("Venakt") || employeeName.equalsIgnoreCase("Raju")) {
			this.employeeName = employeeName;
		} else {
			throw new InvaliedNameException();
		}
     if(employeeId.equalsIgnoreCase("che123")||employeeId.equalsIgnoreCase("sha321")||employeeId.equalsIgnoreCase("ven456")||employeeId.equalsIgnoreCase("raj678"))
     {
		this.employeeId = employeeId;
     }
    else
    {
	throw new InvaliedIDExpetion();
	}

		if (employeeSalary > 15000 && employeeSalary < 90000) {
			this.employeeSalary = employeeSalary;
		} else {
			throw new SalaryOutOfBoundExpetion();
		}
		if (employeeExp >= 1 && employeeExp <= 5) {
			this.employeeExp = employeeExp;
		} else {
			throw new ExpOutOfBoundExpeetion();
		}
		if (employeeloaction.equalsIgnoreCase("Hyderabad") || employeeloaction.equalsIgnoreCase("Bengaluru")
				|| employeeloaction.equalsIgnoreCase("Pune")) {
			this.employeeloaction = employeeloaction;
		} else {
			throw new LocationInvaliedException();
		}
		if (employeeCampanyName.equalsIgnoreCase("Tcs") || employeeCampanyName.equalsIgnoreCase("Wipro")
				|| employeeCampanyName.equalsIgnoreCase("hcl") || employeeCampanyName.equalsIgnoreCase("Infoyes")) {

			this.employeeCampanyName = employeeCampanyName;
		} else {
			throw new InvaliedCompanyNameException();
		}
		if (designation.equalsIgnoreCase("Java developer") || designation.equalsIgnoreCase("Pega Developer")
				|| designation.equalsIgnoreCase("DBA") || designation.equalsIgnoreCase("Testers")) {
			this.designation = designation;
		} else {
			throw new InvalieddesignationException();
		}

	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		// if (getEmployeeExp() >= 5 && getEmployeeExp() <= 10) {
		this.employeeSalary = employeeSalary;
		// } else {
		// throw new SalaryOutOfBoundExpetion();

		// }

	}

	public int getEmployeeExp() {
		return employeeExp;
	}

	public void setEmployeeExp(int employeeExp) {

		{
			this.employeeExp = employeeExp;
		}
	}

	public String getEmployeeloaction() {
		return employeeloaction;
	}

	public void setEmployeeloaction(String employeeloaction) {
		this.employeeloaction = employeeloaction;
	}

	public String getEmployeeCampanyName() {

		return employeeCampanyName;
	}

	public void setEmployeeCampanyName(String employeeCampanyName) {
		/// if (getEmployeeSalary() > 100000 && getEmployeeSalary() < 150000) {
		this.employeeCampanyName = employeeCampanyName;
		// } else {
		// throw new InvaliedCompanyNameException();

		// }
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void dispaly() {
		System.out.println("Employee Name :" + getEmployeeName());
		System.out.println("Employee Id Is :" + getEmployeeId());
		System.out.println("Employee Salary Is :" + getEmployeeSalary());
		System.out.println("Employee Exp :" + getEmployeeExp());
		System.out.println("Employee Location :" + getEmployeeloaction());
		System.out.println("Employee Company Name Is :" + getEmployeeCampanyName());
		System.out.println("Employee Job Is :" + getDesignation());
	}

}
