package test;

public class VowelSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Clean world Green World";
		int count=0;
	for(int i =0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			break;
			
	}
	
	}	
	System.out.println("The no of vowels " +count);

}}
