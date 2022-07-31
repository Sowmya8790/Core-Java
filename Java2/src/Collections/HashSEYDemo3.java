package Collections;

import java.util.HashSet;

public class HashSEYDemo3 {

	public static void main(String[] args) {
		
		//Union, Intersection, difference
		
		HashSet<Integer> hs1=new HashSet<Integer>();
		

		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		
		HashSet<Integer> hs2=new HashSet<Integer>();
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		
		
		//Union
/*		hs1.addAll(hs2);
		
		System.out.println(hs1);*/
		
		//Intersection
		
/*	hs1.retainAll(hs2);
	System.out.println((hs1));*/
	
	//Difference
	hs1.removeAll(hs2);
	
	System.out.println(hs1);
	
	//Subset
	
	System.out.println(hs1.containsAll(hs2));
	
	System.out.println(hs2);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
