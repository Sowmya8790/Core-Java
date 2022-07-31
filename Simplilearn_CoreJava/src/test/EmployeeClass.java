package test;

public class EmployeeClass {
	
	public int Employeeid;
	public String Name;
	public String Department;
	
	public EmployeeClass(int Empid, String na, String Dep)
	{
		Employeeid = Empid;
	    Name = na;
		Department = Dep;
	}
	
	public void display()
	{
		System.out.println(Employeeid);
		System.out.println(Name);
		System.out.println(Department);
		
	}

}
