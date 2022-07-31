package Day1;

public class Assement1 {

	public static void main(String[] args) {
		
	/*int a= 10,b=20,c=100;
	
	System.out.println("Sum of two numbers" + (a+b));*/
		
		// With other variable
		
	int a = 10, b = 15, c;
	
	/*c = a;
	a = b;
	b = c;
	
	System.out.println("value of a" + a);
	System.out.println("value of b" + b);
	System.out.println("value of c" + c);*/
	
	// With out using other variable
	
	a = a+b;
	b= a-b;
	a= a-b;
	
	System.out.println("value of a" + a);
	System.out.println("value of b" + b);
	
	
	}

}
