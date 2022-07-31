package Practise;

public class StringOccurance {

	public static void main(String[] args) {
		
		String s[] = {"Green", "World","Clean", "World", "Nice" ,"World"};
		
		
		boolean flag = false;
		int count=0;
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i] == s[j])
				{
					flag = true;
					count++;
				}
				System.out.println(s[i]+ " This String occurance count is :" +count);
				
			}
			
		}
		
		
		
		if(flag==false)
		{
			System.out.println("No duplicate there :" +s[1]);
		}
		
			
		

	}

}
