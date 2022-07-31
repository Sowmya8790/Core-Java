package OOPS.iinterface;

interface LAX1
{
	int a=100;
	void PTY();
}

interface LAX2
{
	int b=200;
	void SJO();
}  

// Two parental class in 1 child class

public class MultipleInterface implements LAX1,LAX2
{
  public void PTY()
  {
	System.out.println(a);
  }
public void SJO()
{
	System.out.println(b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LAX1 obj1=new MultipleInterface();
		  obj1.PTY();
		  LAX2 obj2=new MultipleInterface();
		  obj2.SJO();
	}

}
