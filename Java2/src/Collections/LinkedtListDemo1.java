package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedtListDemo1 {

	public static void main(String[] args) {
		
	//	LinkedList<Integer> ll=new LinkedList<Integer>(); //to store heterogenous data.
		
		LinkedList ll=new LinkedList();
		
		//Add elements to inked list
		
		ll.add(100);
		ll.add("Sowmya");
		ll.add(98.2);
		ll.add('A');
		ll.add(true);
		ll.add(null);
		
		System.out.println("Adding elemtns in method :" +ll);
		
		ll.addFirst("Welocome");
		ll.addLast("Bye");
		
		System.out.println("Adding elemtns in method to first & last places :" +ll);
		
		//remove elements
		
		ll.remove(3);
		System.out.println("After the removing the object : " +ll);
		
		//adding elemtnt in middle of linked list
		
		ll.add(5,98.7);
		System.out.println("Adding elemt at the index 5 :" +ll);
		
		// contains
		System.out.println(ll.contains(2));
		System.out.println(ll.contains("Sowmya"));
		
		//to read all the elemts
		
		System.out.println(ll.get(5));
		
		//Replace a value 
		
		ll.set(5, 25.7);
		System.out.println("Afyer replacing the value :" +ll);
		
		//isEmplty
		
		System.out.println(ll.isEmpty());
		
		for(int i=0;i>=ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		//For each loop
		
		for(Object j:ll)
		{
			System.out.println("total varibales in the method :" +j);
		}
		
		//Iterator
		
		Iterator it =ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
