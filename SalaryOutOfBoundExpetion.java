package Employeee;

public class SalaryOutOfBoundExpetion extends RuntimeException {
   public String toString()
   {
	   return "Salary Is Only 50k To 90k Only";
   }
}
