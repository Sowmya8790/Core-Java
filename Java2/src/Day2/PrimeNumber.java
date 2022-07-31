package Day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int m,n=90,i;
		m=n/2;
		boolean flag=true;
		
		for( i=2;i<=m;i++)
		{
	if(n%i==0)
			{
			System.out.println("This is not prime");
			flag =false;
			break;
			}
		if(flag)
		{
			System.out.println("this is prime");
			
		}	
	}
	
	}

}
