package OOPS;

public class Methodoverloading {
	int a;
	int b;
	double c;
	void sum()
	{
		a=100;
	    b=200;
		System.out.println(a+b);
	}
	void sum(int x,int y)
	{
		x=a;
		y=b;
		System.out.println(a+b);
	}
	void sum(int x,int y,int z)
	{
		
		System.out.println(x+y+z);
	}
	void sum(int a,int b,double c)
	{
		this.a=a;
	    this.b=b;
	    this.c=c;
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    
	}
	public static void main(String args[])
	
	{
		Methodoverloading t=new Methodoverloading();
		t.sum();
		t.sum(10,20);
		t.sum(10,20,30);
		t.sum(100,200,20.9);
	}

}
