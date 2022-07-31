package Day1;

public class Operators {

	public static void main(String[] args) {
		int a = 10, b=20;
	// Arthimation operators (+,-,*,%,/)
		System.out.println("Sum of two numbers" + (a+b));
		System.out.println("Sum of two numbers" + (a-b));
		System.out.println("Sum of two numbers" + (a*b));
		System.out.println("Sum of two numbers" + (a%b));
		System.out.println("Sum of two numbers" + (a/b));
		
	// Comparision operators (<,>,==,<=,>=,!=)
	//	Max it give boolean values
		
		System.out.println(a<=10);
		System.out.println(a>=10);
		System.out.println(a==10);
		System.out.println(a!=10);
		System.out.println(a<b);
		
	//Logical operators (&&    ||  !)
		//Works between two boolean expression
		
		boolean i = true;
		boolean j = false;
		
		System.out.println(i && j);
		System.out.println(j || j);
		System.out.println(!i);
		System.out.println(!j);
		
	//incremental/Decremental expression (++,--)
		
		
		System.out.println(a);
		a++;
		System.out.println(a);
		b--;
		System.out.println(b);
		
	}

}
