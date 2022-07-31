package OOPS;

public class Methoex3 {
int a;
int b;
// A method returns some values
int Sum()
{
	return(a+b);
}
public static void main (String args[])
{
	Methoex3 Cal=new Methoex3();
	Cal.a=100;
	Cal.b=200;
	int r=Cal.Sum();
	System.out.println(r);	
}
}
