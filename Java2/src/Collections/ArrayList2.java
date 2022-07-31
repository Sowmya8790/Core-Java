package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
 
		al.add('D');
		al.add('B');
		al.add('C');
		al.add('X');
		al.add('D');
		al.add('E');
		System.out.println(al);
 
		//ADD ALL
		ArrayList al_d=new ArrayList();
 
		al_d.addAll(al);
 		System.out.println(al_d);
 		
 		//Remove all
 		
 		al_d.removeAll(al);
 		System.out.println(("The objects in that collection removed: " +al_d));
 		
 		
 		//Sorting
 		
 		Collections.sort(al);
 		System.out.println("Object after sorting:" +al);
 		
 		//REVERSE SORTING
 		
 		Collections.sort(al,Collections.reverseOrder());
 		
 		System.out.println("Elements in the array list after reverse sorting :" +al);
 		
 		//Shufflr the elements
 		
 		Collections.shuffle(al);
 		System.out.println("The elemnts in array is shuffled :" +al);
 		
 		//Array to array List
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}

}
