package Practise;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int a=78987;
		
		int rev=0;
		int rem;
		int temp=a;
		
		while(a>0)
		{	
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println(rev);
		
		if(temp==rev)
		{
			System.out.println("This is Plaindrome Number :" +rev);
		}
		else
		{
			System.out.println("This is not Palindrrome Number :" +rev);
		}

	}

}
