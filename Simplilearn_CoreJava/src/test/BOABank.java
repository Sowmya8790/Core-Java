package test;

public class BOABank extends Bank{
	
	public int cardnum;
	int accno;
	public void ccbalance()
	{
		System.out.println("Inside cc balance");
	this.cardnum=13456789;
	super.accno=234567;
	
	}
	public void closeaccount(int cardnum)
	{
		System.out.println("Inside BOA bank close account");
	}

	

}
