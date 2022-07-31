package test;

public class Bank{
	
	int accno;
	
	public void Displaybalance()
	{
		System.out.println("Inside account balance");
	}
	
	public int GetBalance()
	{
		return 100;
	}
	public void closeaccount(int accno)
	{
		System.out.println("Inside bank close account");
	}

}
