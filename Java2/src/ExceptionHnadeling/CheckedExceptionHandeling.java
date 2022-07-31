package ExceptionHnadeling;

public class CheckedExceptionHandeling {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("This is one");
		System.out.println("This is two");
		
		//Exception handeling using Try ....catch method
		/*try
		{
		Thread.sleep(4000);    // InterruptedException
		}
		catch( InterruptedException e)
		{
			e.printStackTrace();
		}
		//Compiler takes few minutes to execute below code as thread exception there
		
		System.out.println("This is three");
		System.out.println("This is four");*/
		
		//Exception handling using

		Thread.sleep(4000);  //(Exception should be given at method level)
		
		//Compiler takes few minutes to execute below code as thread exception there
		
		System.out.println("This is three");
		System.out.println("This is four");
		
	}

}
