package OOPS.iinterface;

interface Testinter
{
	int a=100;
	
	void inter(); //interface we can just give definition but can't implement
}

class Test implements Testinter
{
	int x=200;
	public void inter()  //as in interfacr the method default in public so here we have to mention public other wise it takes default by default.
	 {
		 System.out.println(x);
		 System.out.println(a);
	 }
}
public class Interfacemultiinheritance {

	public static void main(String[] args) {
		
     Testinter obj1=new Test();
     obj1.inter();
    /* D objd=new D();
     objd.display();*/   // This is default modifier used so this can be access anywhere with in the package.
     
	}

}
