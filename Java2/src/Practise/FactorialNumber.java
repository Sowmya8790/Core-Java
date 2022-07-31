package Practise;



public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int a= 6;
		
		int fact=1;
		int fact_r=1;
		
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;  //1*2*2*4*5
			System.out.println(fact);
		}
		
		System.out.println("The factorial of a number a :" +fact);
		
		// Print in reverse 6*5*4*3*2*1
		
		for(int j=a; j>=1;j--)
		{
			fact_r=fact_r*j;
			System.out.println(fact_r);
		}
		
		System.out.println("The factorial of number :" +fact_r);
		

	}

}
