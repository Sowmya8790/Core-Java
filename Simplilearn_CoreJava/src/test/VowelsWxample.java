package test;

public class VowelsWxample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Clean world Green World";
		//s.toUpperCase();
		int count =0;
		int flag =0;
		
		
		for(int i=0;i<s.length();i++)
		{
			
			char ch = s.charAt(i);  //here is the logic
			
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
				
			}
			
			
		}
		System.out.println("Total number of vowels is " +count);
		
		
		

	
	
		
		
		
		
		
				
	}

}
