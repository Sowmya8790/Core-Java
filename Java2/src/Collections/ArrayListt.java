package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList al=new ArrayList();  //Stores heterogenous data
	
		//ArrayList<String> al1 = new ArrayList<String>(); // Stores homogenous data
		al.add(10);
		al.add("Come");
		al.add(109.8);
		al.add('d');
		
		System.out.println("Add all these objectes :" +al);
		
		//addall
		al.addAll(al);
		
		System.out.println("Adds all the values in collection al :" +al);
		
		//add using index--add at particular location
		al.add(2,"Two");
		
		System.out.println("Adding using index number :" +al);
		
		//get() to check the value is present ?
		
		al.get(2);
		System.out.println("to serach the object " +al.get(2));
		
		//to replace the object set()
		
		al.set(1, "COMEON");
		
		System.out.println("To replace the object with other :" +al);
		
		//remove()
		
		al.remove(2);
		System.out.println("The objevt at the indexc removed :" +al);
		
		//Cointains()
		
		System.out.println("The give object present in colletions? : " +al.contains(109.8));
		
		
		//For loop
		System.out.println("the elements retrive by for each loop");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		  //for each loop
		
		System.out.println("the elements retrive by for each loop");
		
		for(Object r:al)
		{
			System.out.println(r);
		}
		
		//iterator -- Arraylist having this method which reads data in the Arraylist
		
		Iterator it =al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
