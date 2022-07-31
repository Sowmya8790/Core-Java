package test;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Clean world Green World";
		
		String result=" ";
		for(int i=s.length() -1;i>=0;i--)
		{
			char ch = s.charAt(i);
			result =result+ch;
		}
		System.out.println("This is the reversed String :" +result);
		
		
		//reverse a number
		
				int a=456789;
				int res= 0;
				
				while(a>0)
				{
					int rem = a%10;  //9
					res = res*10 + rem; //0*10+9
					a=a/10; //45678
				}
			System.out.println("The reserved number " +res);
			
			

	}

}
