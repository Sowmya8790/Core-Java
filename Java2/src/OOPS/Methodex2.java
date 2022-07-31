package OOPS;

public class Methodex2 {
	
	int a;
	int b;
	//// Method does take parameters
	void sum(int x, int y)
	{
		x=a;
		y=b;
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		Methodex2 sum1=new Methodex2();
		sum1.sum(100,200);
	}
	
}
