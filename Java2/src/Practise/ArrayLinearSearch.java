package Practise;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60,70,90};
		
		//To check whather the given number there in array or not.
		
		int temp=50;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(temp==a[i])
			{
				System.out.println("This number there in array at index :" +i);
				flag=true;
				break;
				
			}
		}
		if(flag==false)
		{
			System.out.println("This number not there in array");
		}
		
		
		
		

	}

}
