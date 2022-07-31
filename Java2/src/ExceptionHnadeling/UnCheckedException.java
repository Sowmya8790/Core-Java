package ExceptionHnadeling;

public class UnCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int a=20;
	//	System.out.println(a/0);  //Arthimatic exception get error while complie
		
	//	String s=null;
	//	System.out.println(s.length());  //Null Pointer Exception
		
	/*	String st="abcdef";
		int i=Integer.parseInt(st);
		System.out.println(i);  */ //NumberFormatException  
		
		//a number in string can to converted into integer or double but a String contains word cannot converted to number.
		
		int arr[] =new int[5];
		arr[10]=100;  //ArrayIndexOutOfBoundsException
	}

}
