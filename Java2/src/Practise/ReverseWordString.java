package Practise;



public class ReverseWordString {

	public static void main(String[] args) {
		
		String s="Welcome world Good Morning";
		
		String ReverseString="";
		
	    String[] s1=s.split(" ");
		
	
		
		for(String w:s1)
		{
			String reverseWord = "";
			
			for(int i=w.length() -1;i>=0;i--)
			{
				
				
				reverseWord=(reverseWord + w.charAt(i));
				
			}
			
			ReverseString= (ReverseString + reverseWord +" ");
			
			
		}
		System.out.println("Total words in reverse order :" +ReverseString);
		
		
		
				
		

	}

}
