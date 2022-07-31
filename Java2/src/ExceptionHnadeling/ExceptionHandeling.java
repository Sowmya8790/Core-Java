package ExceptionHnadeling;

public class ExceptionHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exception occurs,catch block handles,finally block also execute.
		
	/*	int a=20;
		
			try
			{
				System.out.println(a/0);  //Arthimatic exception get error while complie
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
			finally
			{
				System.out.println("This is Exception Hnadeling");
			}*/
		
		
		
		//Exception occurs,catch block not handles,finally block also execute.
		
		/* String s=null;
		
		try
		{
			System.out.println(s.length());
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is Null Pointer Exception");
		}*/
		
		//Exception not occurs,catch block will ignore,finally block also execute.

		int p[]=new int[5];
		
		try
		{
			p[3]=100;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is Exception itself error");
		}
		
	}

}
