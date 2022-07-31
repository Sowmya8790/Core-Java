package Day1;

import java.util.Scanner;

public class whileLoops {

	public static void main(String[] args) {
		
         Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		
		
		int Sum=0;
		int rem=0;
		
		while(n>0)
		{
			rem=n%10;
			Sum=Sum+(rem*rem*rem);
			n=n/10;
		}
		System.out.println(Sum);
		
		if(n==Sum)
		{
			System.out.println("This is even");
		}
		else
		{
			System.out.println("Odd number");
		}
			
	}

}
