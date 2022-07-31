package test;

public class ExceptionHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5};
		int s=10;
		System.out.println("Before Exception");
		
		try
		{
			int rem=s/0; //ArithmeticException  //from here it directly goes to catch block not next line of code
			
		System.out.println(a[8]); //ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("This is array inside the catch");
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is artimatic inside the catch");
		}
		finally {
			System.out.println("Inside Finally");
		}
		System.out.println("After Exception");
	}

}
