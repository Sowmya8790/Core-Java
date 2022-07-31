package Collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1=new HashMap<Integer,String>();
		
		map1.put(1, "Sowmya");
		map1.put(2, "Sri");
		map1.put(3, "Gayatri");
		map1.put(4, "Lavanya");
		map1.put(5, "Vani");
		map1.put(100, "Babula");
		map1.put(2, "Sowjanya");
		
		System.out.println(map1);
		System.out.println("Data at 4th Key is :" +map1.get(4));
		System.out.println("Data at 100th Key is :" +map1.get(100));
		
		map1.remove(100);
		System.out.println("Remove the value at 100th Key :" +map1);
		
		for(Integer key: map1.keySet())
		{
			System.out.println("key is :" +key);
			System.out.println("Value is :" +map1.get(key));
		}

	}

}
