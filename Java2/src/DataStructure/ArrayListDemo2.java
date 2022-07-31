package DataStructure;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1=new ArrayList();
		
		al1.add(100);
		al1.add("Somwya");
		al1.add('A');
		al1.add(true);
		al1.add(28.9);
		al1.add(null);
		
		System.out.println(al1);
		
		//Size of array
		System.out.println("Total nod elements in arra is :" +al1.size());
		
	    //inserting elemensta\ into arraylist
		al1.add(2,"Im in");
		al1.add(1,1234);
		System.out.println(al1);
		System.out.println(al1.size());
		
		//removing elements from ArrayList
		
		al1.remove(1);
		System.out.println(al1);
		
		al1.remove(28.9);
		System.out.println(al1);
		
		
		
		
	}

}
