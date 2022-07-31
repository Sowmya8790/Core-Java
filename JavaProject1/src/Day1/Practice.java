package Day1;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		int Sum=0;
		int rem;
		int temp = n;
		
		while(n>0)
		{
			rem=n%10;
			Sum=Sum+ (rem*rem*rem);
			n=n/10;
		}
		
		if(temp == Sum)
		{
			System.out.println("This is even");
		}
		else
		{
			System.out.println("Odd number");
		}
			
	}
}