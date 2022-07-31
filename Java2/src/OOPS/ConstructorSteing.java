	package OOPS;

public class ConstructorSteing
{
	int empid;
	String empname;
	int deptno;
	int salary;

// Method name is sanme as class name then it is constructor.

ConstructorSteing(int id,String name,int sal,int dn)
{
	empid=id;
	empname=name;
	salary=sal;
	deptno=dn;
}

void display()
{
	System.out.println(empid);
	System.out.println(empname);
	System.out.println(deptno);
	System.out.println(salary);
}
public static void main(String args[])
{
	//Assigning values to class variables using constructor
	
	ConstructorSteing emp1=new ConstructorSteing(101,"Sowmya",30000000,6);
	emp1.display();
	ConstructorSteing emp2=new ConstructorSteing(102,"Sowma",300000000,7);
	emp2.display();
	
	
}
}