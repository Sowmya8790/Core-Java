package Practise;

public class FindDuplicates {

	public static void main(String[] args) {
		
		String a ="Green World Clean World";
		
		
		String[] b= a.split(" ");
		String l_1 =" ";
		int count =0;
		
		int l=a.length();
		System.out.println(l);  //Total number of char 
	     
	/*     l_1 =a.replace("e","");  //After removing e total no of char by comparing l & l_1 we get no of e in string
	     System.out.println(l_1.length());
	     
	     int Length = l-l_1.length();
	     
	     System.out.println("The total e's present in the String are :" +Length);*/
		
		for(int i=0;i<a.length();i++)
		{
			char ch = a.charAt(i);
			if(ch == 'e')
			{
			   count++;
			}
			
			
		}
		System.out.println("Total no e in the given String :" +count);
		
	     
	    

	}

}
