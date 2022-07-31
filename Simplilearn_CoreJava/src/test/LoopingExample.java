package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a=2;
		//till 10
		
		while(a<=10)
		{
			System.out.println(a);
			a=a+2;  // a=a+1
		}*/
		
	/*	int a=2;  //using while & if loop
		while(a<=10)
		{
			if(a==6)
			{
				System.out.println("this is six");
			}
			else
			{
				System.out.println(a);
			}
			a=a+2;*/
		
		
	/*  int a=2;  //using while & if loop & continue
		while(a<=10)
		{
			if(a==6)
			{
				a=a+2;
				continue; //go back to while below code wont execute
			}
			else
			{
				System.out.println(a);
			}
			a=a+2; */
		
	/*	int a=2;  //using while & if loop & break
		while(a<=10)
		{
			if(a==6)
			{
				a=a+2;
				break; //after loop reach 6 it will brak the loop
			}
			else
			{
				System.out.println(a);
			}
			a=a+2;*/
		
		// for loop
		
	/*	for(int i=1;i<=10;i++)
		{
			if(i==6)
			{
				continue;
			}
			System.out.println(i);
		}*/
		int[] a= {1,2,3,4,5,6};
		
		/*for(int o:a)
		{
			System.out.println(o);
		}*/
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}

}
