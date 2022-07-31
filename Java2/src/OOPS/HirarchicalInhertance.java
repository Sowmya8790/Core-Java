package OOPS;

class BANK
{
	int rateofintrest()
	{
		return 0;
	}
}
class SBI 
{
	int rateofintrest()
	{
		return 10;
	}
}
class AXIS
{
	int rateofintrest()
	{
		return 20;
	}
}
class ICICI
{
	int rateofintrest()
	{
		return 30;
	}
}
public class HirarchicalInhertance {
	

	public static void main(String[] args) {
		
     BANK b1=new BANK();
     System.out.println(b1.rateofintrest());
     SBI b2=new SBI();
     System.out.println(b2.rateofintrest());
     AXIS b3=new AXIS();
     System.out.println(b3.rateofintrest());
     ICICI b4=new ICICI();
     System.out.println(b4.rateofintrest());
	}

}
