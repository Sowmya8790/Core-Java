package OOPS;

public class Constructoroverloading {

	int a=0;
	int b=0;
	double c=0;
	

	Constructoroverloading() //2nd Constructoroverloading
	{
		a=10;
		b=20;
		
	}
	Constructoroverloading(int x,int y) //1t Constructoroverloading
	{
		a=x;
		b=y;
		}
	Constructoroverloading(int x, double z)// 2nd Constructoroverloading
	{
		a=x;
		c=z;
	}
	
	
	// Constructor cannot return values so give method void display
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	public static void main(String args[])
	{
	Constructoroverloading co=new Constructoroverloading();
    co.display();
	Constructoroverloading co1=new Constructoroverloading(10,20);
	co1.display();
	Constructoroverloading co2=new Constructoroverloading(10,200.9);
	co2.display();
		
	}
}
