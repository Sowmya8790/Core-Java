package OOPS;

class m1
{
	int a;
	int b;
	void display()
	{
		System.out.println(a+b);
	}
}
class m2 extends m1  //Single Inheretance
{
	int x;
	int y;
	void show()
	{
		System.out.println(x+y);
	}
}

class m3 extends m2  // Mutli level/ Multiple Inheritance
{
	int i;
	int j;
	void addition()
	{
		System.out.println(i+j);
	}
}
public class Inheretance {
	public static void main(String args[])
	
	{
		m1 obja=new m1();
		obja.a=100;
		obja.b=200;
		obja.display();
		
		m2 objb=new m2();
		objb.x=10;
		objb.y=20;
		objb.a=1000;
		objb.b=2000;
		objb.show();
		objb.display();
		
		m3 objc=new m3();
		objc.x=100;
		objc.y=200;
		objc.a=300;
		objc.b=400;
		objc.i=500;
		objc.j=600;
		objc.show();
		objc.display();
		objc.addition();
		

		
	}

}
