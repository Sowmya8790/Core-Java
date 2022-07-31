package OOPS;

class Final
{
	int a=100;
	final int b=200;
	final void display()
	{
		a=20;
		//b=10;  //b values shows error as its a final variable
		System.out.println(a);
		System.out.println(b);
	}
}
class Final1 extends Final
{
	int x=300;
	final int y=400;
	/*void display()  //as parental method is final we cant use that in further class.
	{
		x=20;
		//y=10;  //y values shows error as its a final variable
		System.out.println(x);
		System.out.println(y);
	}*/
	
}
public class Finalkeyword {

	
	public static void main(String[] args) {
		
		Final1 f1=new Final1();
		System.out.println(f1.a);
		System.out.println(f1.b);
		System.out.println(f1.x);
		System.out.println(f1.y);
		
		
		
	}

}
