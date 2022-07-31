package Day1;

public class SwitchCase {

	public static void main(String[] args) {
		
		/*if there is requirement for more no of conditions more 
		than 5 then switch for switch case or else use nested if */
		
		int Day = 1;
		switch(Day)
		{
		case 1: System.out.print("Monday"); break; 
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednusday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		default: System.out.println("Sunday");		
		}
		

	}

}
