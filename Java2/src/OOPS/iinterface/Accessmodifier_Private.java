package OOPS.iinterface;

class A
{
	private int a=100;
	 private void a1()
	{
		System.out.println(a);
	}
	
}

public class Accessmodifier_Private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    A obja=new A();
  // objA.a     // as in class we mentioned private it access for class itself.
 //  objA.m1(); //cannot access as it is private.
	}

}
