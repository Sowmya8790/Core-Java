package Practise;

public class ArrayMissingNum {

	public static void main(String[] args) {
		
		//Array should not have duplicates
		//Array no need to be in sorted order
		//Values should be in range.
		
		int a[] = {1,2,4,5};
		int Sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			Sum1=Sum1+a[i];
		}
		System.out.println("The sum of all numbers in array :" +Sum1);
		
		int sum2=0;
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
			
		}
		System.out.println("The sum of total numbers with range of 1-5 :" +sum2);
		
		int Sum=0;
		
		Sum = sum2 - Sum1;
		
		System.out.println("The missing number in the array :" +Sum);

	}

}
