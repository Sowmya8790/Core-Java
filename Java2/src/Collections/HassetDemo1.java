package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HassetDemo1 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();//default capacity is 16 and default loadfactor 0.75
		
		hs.add('A');
		hs.add("welcome");
		hs.add(100);
		hs.add(89.4);
		hs.add(true);
		hs.add(null);
		System.out.println("Total elements in set " +hs);  //[null, A, 100, 89.4, welcome, true]
		
		//remove
		hs.remove("welcome");
		System.out.println("the elment is removed from set " +hs);//[null, A, 100, 89.4, true]

		//contains
		System.out.println(hs.contains(100));//true
		System.out.println(hs.contains(200));//false
		
		//to read all the lement from objevt.
		
		/*for(Object l: hs)
		{
			System.out.println(l);
		}*/
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
