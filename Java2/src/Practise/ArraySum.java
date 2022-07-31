package Practise;

public class ArraySum {

	public static void main(String[] args) {
		
		
	/*	int a[] = {10,20,30,40,50};
		
		int Sum=0;
		
		for(int i=0;i<=a.length -1;i++)
		{
			Sum = Sum+a[i];
			}
		System.out.println(Sum);
		System.out.println(a.length);*/
		
		//Print even /odd number.
		
		int a[]= {10,20,25,30,40,45};
		
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)   //(a[i]%2 !=0(Odd))
				System.out.println("Thses are eveng number" +a[i]);
		}
		
		//Enhanched for loop
		
		for(int v:a)
		{
			if(v%2 !=0)
				System.out.println(v);
		}*/
		
		
		//to find max & min value in array
		/*int max = a[3];
		
		for(int i=0;i<a.length;i++)
			
		{
			if(a[i]>max)
			{
				max=a[i];
				System.out.println(a[i]);
			}
			System.out.println("The min elemenr is " +min);
			
			
		}
		
		System.out.println("The min elemenr is " +min);*/
		
		//To find min number
		
		int min =a[0];
				
				for(int j=0;j<a.length;j++)
					
				{
					if(a[j]<min)
					{
						min=a[j];
						System.out.println(a[j]);
					}
								
				}
				System.out.println("The min element is " +min);
		
		
		
		
		
		

	}

}
