package Day2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		/*int r,Sum=0,temp;
		int n=5678;
		
		temp=n;
		while(n>0)
		{
			r=n%10;
			Sum= (Sum*10)+r;
			n= n/10;
			
		}
		if(temp==Sum) {
			System.out.println("Not a plandrome number");
		}
		else
			System.out.println("It is plaindrome number");*/
		
		/*int n =89765;
		int Sum=0,r,temp;
		
		
		for(;n>0;n=n/10)
			
		{
			r=n%10;
			Sum=Sum*10+r;
		}
		//System.out.println(Sum);
		if(Sum==n)
		{System.out.println("this is not reverse number:" +Sum);
		
		}else
			System.out.println("this  reverse number:" +Sum);
	}

}*/
		
Scanner sc =new Scanner(System.in);
		
		int a=sc.nextInt();
		int temp=a;
		int rem,Sum=0;
		System.out.println("Enter the number :");
		
		for(;a>0;a=a/10)
		{
			rem = a%10;
			Sum =Sum*10+rem;
				
		}
		
		System.out.println("Reverse of number :" +Sum);
		
		if(temp==Sum)
		{
			System.out.println("This is Palindrome Number");
		}
		else
		{
			System.out.println("This is not palindrome");
		}

	}

}

