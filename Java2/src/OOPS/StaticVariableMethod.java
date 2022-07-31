package OOPS;

public class StaticVariableMethod {
	
	int a;
	int b;
	static int c;
	
	void m1()
	{
		System.out.println("this is static");
			}
	static void m2()
	{
		System.out.println("this is static method");
	}
	
	void m3()
	{
		// Non static method can access static method & variable and also non static method & variable.
		a=500; //non static variable
		b=1000; // static variable
		System.out.println(a);
		System.out.println(b);
		
		m1(); // non static method
		m2(); //  static method
	}
	
	
	public static void main(String args[])
	{
		m2();
	  c=1000;
	  System.out.println(c);
	 
	  
	 // a=100; this is not accessed bcz its non static variable 
	  
	 StaticVariableMethod s1=new StaticVariableMethod();
	  {
		 
		 s1.m1();
		 s1.a=400;
		 System.out.println(s1.a);
		 s1.m3();
		 
		  }
	  
	}
	
}


