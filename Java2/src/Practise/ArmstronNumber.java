package Practise;

import java.util.Scanner;

public class ArmstronNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println("This is Armstrong");// 153 = 1^2 + 5^2 + 3^2  = 153
		}
		else
		{
			System.out.println("Not armstrong");
		}
			
	}

}
