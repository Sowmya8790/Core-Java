package test;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	EmployeeClass E1=new EmployeeClass();
		
		E1.Employeeid = 987;
		E1.Name = "Sowmya";
		E1.Department = "Cib";
		
		System.out.println(E1.Employeeid);
		System.out.println(E1.Name);
		System.out.println(E1.Department);
		
		//E1.display();
		
		EmployeeClass E2=new EmployeeClass();
		E2.Employeeid = 9876;
		E1.Name = "Sowmi";
		E2.Department = "Ciba";
		E2.display();
		
	/*	//Using constructor
		
		EmployeeClass E1=new EmployeeClass(234,"Sunny","Fia");
		E1.display();*/
		
		Bank B= new Bank();
		B.Displaybalance();
		
		int Bal = B.GetBalance();
		
		System.out.println("The balance is:" +B.GetBalance());
		System.out.println("The balance is" +Bal);
		B.accno=10;
		
		BOABank AB =new BOABank();
		
		AB.ccbalance();
		AB.GetBalance();
		AB.Displaybalance();
		AB.accno=100;
		
		Overloading OL = new Overloading();
		
		int arearec = OL.GetArea(4, 5);
		int areasquare = OL.GetArea(2);
		System.out.println(arearec+" "+areasquare);
		
		B.closeaccount(1234567);
		AB.closeaccount(123456);
		
		firefox ff =new firefox();
		ff.closebrowser();
		ff.Openbrowser();
         ff.show();
		
		chromebrowser cb =new chromebrowser();
		cb.closebrowser();
		cb.Openbrowser();
		cb.display();
		
		
		BrowserAbstraction B1 =new firefox(); //for abstraction methos like this have to iplement object
		B1.display();
		B1.Openbrowser();
		B1.closebrowser();
		//B1.show(); cant access there only in the child
		
		HondaCarInter HC =new HondaCarInter();
		
	//	Carinterface  C new Carinterface(); can't create object for parental interface can do using child class as shown below
		
		Carinterface C = new HondaCarInter();
		
	
		
		
	}

}
