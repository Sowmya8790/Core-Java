package Week1;

public class AutomorphicNumber {
	
	static boolean isAutomorphic(int num) 
	{
		int Square = num*num;
		
		while(num>0)
		{
			if(num%10 != Square%10)
			return false;
			num =num/10;
			Square=Square/10;
		}
		return true;
	}
	
 //76&76 =5776 So automorphic but 67*67 = 4489 as last two digits are not 67 so not automorphic.
	
	

	public static void main(String[] args) {
		
		System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");
		System.out.println(isAutomorphic(67) ? "Automorphic" : "Not Automorphic");
		
		//to find no of automorpic numbers between 1-99
		
		for(int i=0;i<=99;i++)
		{
			if(isAutomorphic(i))
			{
				System.out.println(i);
			}
		}
		

	}
	
	

}
