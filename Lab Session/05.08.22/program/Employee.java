package classandobjects;

public class Employee {
	/*Veda : A class called Employee, which models an employee with an ID, name,salary and address 
	Print all the details about particular employee in main  class*/
	long EmployeeId;
	String EmployeeName;
	double Salary;
	String Address;
	public Employee()
	{    EmployeeName="veda Vinayagam";
	     EmployeeId=237878748956L;
	     Salary=10000;
	     Address="3264,Kilpakkam,Chennai.";
	}
	public static void main(String args[])
	{      Employee myobj =new Employee();
	       System.out.println(myobj.EmployeeName);
	       System.out.println(myobj.EmployeeId);
	       System.out.println(myobj.Salary);
	       System.out.println(myobj.Address);
	       
	       
	
	}

}
