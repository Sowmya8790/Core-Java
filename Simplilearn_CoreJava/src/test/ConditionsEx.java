package test;

public class ConditionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =17;
		
		if(age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		else if(age==17)
		{
			System.out.println("Sorry try again next year");
		}
		else
		{
			System.out.println("you are not eligible");
		}
		
	}

}
