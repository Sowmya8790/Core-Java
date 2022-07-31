package test;

public class datatypeex {

	public static void main(String[] args) {
		
		int num1 = 100;
		int	num2 = 200;
		int sum = num1 + num2;   //Arthimatic Operators
		int mul = num1 * num2;
		int a=30;
		int b=20;
		float div = (float) a/b;  //Type Casting
		
		System.out.println("Sum of 2 numbers is"   +  sum);
		System.out.println("Multiplication of two numbers"+" "  + mul);
		System.out.println("Divide of two numbers"+" "  + (num1/num2));
		System.out.println("Substraction of two numbers"+" "  + (num1-num2));
		System.out.println("modules of two numbers"+" "  + (num1|num2));
		System.out.println("Divide of two numbers"+" "  + div);
		
		String s="Clean world Green World";
		System.out.println("the length of the string"+" "+s.length());
		System.out.println("the indexc of char"+" "+s.indexOf('r'));	
		
		char ch=s.charAt(4);
		System.out.println("the char at give index"+" "+ch);
		
		char ch1=s.charAt(s.length() -1); //last char
		System.out.println("the last char"+" " +ch1);
		
		System.out.println("The string in upper case"+" "+s.toUpperCase());
		System.out.println("The string in lower case"+" "+s.toLowerCase());

	}

}
