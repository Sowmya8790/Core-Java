package Collections;

import java.util.HashMap;

public class OccuranceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Clean world green world love world";
		String[] words= str1.split(" ");
		
		HashMap <String, Integer> map1= new HashMap<String, Integer>();
		
		for(String word: words)
		{
			if(map1.get(word) == null)
			{
				map1.put(word, 1);
			}
			else
			{
				map1.put(word, (map1.get(word) +1));
			}
		}
		System.out.println(map1);
	}

}
