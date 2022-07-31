package OOPS;

public class UsingMethodDeclar {
	int empid;
	String empname;
	int deptno;
	int salary;

void setdata(int id,String ename,int depn,int sal)
{
empid=id;
empname=ename;
deptno=depn;
salary=sal;
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
	UsingMethodDeclar emp1=new UsingMethodDeclar();
	emp1.setdata(101,"SOWMYA",56,900000000);
	emp1.display();
	
	
}
}
