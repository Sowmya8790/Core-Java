package DataStructure;

import java.util.ArrayList;

public class ArrayListD1 {

	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList<String>();
		
		//Adding elements
		
		al.add("Sunny");
		al.add("Sowmya");
		al.add("Sowji");
		al.add("Lavanya");
		al.add("Sumanya");
		
		System.out.println(al);
		
		//To find the elements in arralist
		
		System.out.println(al.size());
		
		//to retrive all values in the arraylist
		
		for(String s:al)
		{
			System.out.println(s);
		}
		
		
		

	}

}
