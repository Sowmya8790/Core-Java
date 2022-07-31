package OOPS;

public class MethodEx1 {

	int a;
	int b;
	// Method does not take parameters
	void Sum()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	
	public static void main(String args[])
	{
	MethodEx1 sum1=new MethodEx1();
	
	//Method does not take parameters.
	sum1.a=100;
	sum1.b=200;
	sum1.Sum();

		}
}
