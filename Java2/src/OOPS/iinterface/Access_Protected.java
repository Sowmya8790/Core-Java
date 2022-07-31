package OOPS.iinterface;

public class Access_Protected {
	
	protected int i=10;
	protected void lava()
	{
		System.out.println(i);
	}

	public static void main(String[] args) {
		
Access_Protected aobj=new Access_Protected();
aobj.i=10;
aobj.lava();

	}

}
