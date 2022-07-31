package Week1;

import java.util.*;  
public class PetersonNumber
{  
//an array is defined for the quickly find the factorial  
static int[] factorial = new int[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};  
//driver code 

	static boolean peterson(int n)
	{
		int num =n;
		int sum =0;
		
		while(num>0)
		{
			int digit=num%10;
			sum=sum+factorial[digit];
			num=num/10;
			
		}
		return(sum==n);
	}


public static void main(String args[])  
{  
	
	
		
		int a=145;
		System.out.println("Enter the number");
		if(peterson(a))
		{
			System.out.println("Peterson");
			
		}
		else
		{
			System.out.println("not peterson");
		}

}

}
