package OOPS;

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

class VESPA
{
	void run()
	{
		System.out.println("VESPA is running");
	}
}

class KTM
{
	void run()
	{
		System.out.println("KTM is running");
	}
}

public class Hirarchicalex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Vehicle v1=new Vehicle();
 v1.run();
 VESPA v2=new VESPA();
 v2.run();
 KTM v3=new KTM();
 v3.run();
 
 
	}

}
