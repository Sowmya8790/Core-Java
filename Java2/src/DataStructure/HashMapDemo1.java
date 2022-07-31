package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding key Pairs into Hashmap
		hm.put(100, "Somwya");
		hm.put(101,"Sara");
		hm.put(103,"Sina");
		
		System.out.println(hm);
		
		for(Map.Entry h:hm.entrySet())
		{
			h.getKey();
			h.getValue();
			System.out.println(h.getKey()+ " " +h.getValue());
		}
		
		hm.remove(103);
		System.out.println(hm);

		

	}

}
