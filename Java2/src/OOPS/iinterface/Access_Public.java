package OOPS.iinterface;

public class Access_Public {

	public int k=789;
	public void Show()
	{
		System.out.println(k);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Access_Public lobj=new Access_Public();
lobj.k=789;
lobj.Show();
	}

}
