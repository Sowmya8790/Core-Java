package Day2;

public class FebnocciSeries {

	public static void main(String[] args) {
	
		int a=0,b=1,c;
		for(int i=0;i<=15;i++)
		{
		c=a+b;
		System.out.println(c);
		a=b; //a=1,a=1,a=2
		b=c;//b=1,b=2,b=3
		}
		
	}

}
