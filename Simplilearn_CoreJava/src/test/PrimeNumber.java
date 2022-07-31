package test;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =45;
		boolean flag=true;
		
		for(int i=2;i<a;i++)
		{
			int rem=a%i;  //here is the logic as num is 17 upto 16 have to divide wit 17 the remider should be 0
			
			if(rem==0)
			{
				System.out.println("This is not prime number");
				flag = false;
				break;
				
			}
		
		}
		if(flag==true)
		{
			System.out.println("This is Prime number");
		}
		
	}

}
