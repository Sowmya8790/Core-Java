package OOPS.iinterface;

class D
{
	int s=909;
	void display()
	{
		System.out.println(s);
	}
	
}
public class Access_Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   D objd=new D();
   objd.display(); 
   objd.s=909;
	}

}
