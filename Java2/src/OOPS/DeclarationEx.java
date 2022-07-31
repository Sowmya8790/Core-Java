package OOPS;

public class DeclarationEx
{
	//Decalring variables
	
	int empid;
	String empname;
	int deptno;
	int salary;
	
	// writing method
	
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(deptno);
		System.out.println(salary);
	}
	//Main class
	public static void main(String args[])
	{
		DeclarationEx emp1=new DeclarationEx();
		emp1.empid=101;
		emp1.empname="Sowmya";
		emp1.deptno=3;
		emp1.salary=5000000;
		emp1.display();
			
	}		
		
	}
	
	

