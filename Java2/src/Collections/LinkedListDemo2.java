package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList li=new LinkedList();
		
		li.add('A');
		li.add('C');
		li.add('D');
		li.add('H');
		li.add('Y');
		li.add('Z');
		
		System.out.println("the toal variable in the list :" +li);
		
		li.addFirst('H');
		li.addLast('F');
		System.out.println("Adding 1st & last place :" +li);
		
		LinkedList new_li=new LinkedList();
		new_li.add('K');
		//remove
		
		li.remove(new_li);
		System.out.println("removing the ekemnts from the list " +new_li);
		
		System.out.println("To read the vlaues in the list "+li.get(6));
		
		//Soeting the lemnts this can be ddone only if the data is is homogeneous.
		Collections.sort(li);
		System.out.println("After sortng :" +li);
		
		//Reverse sorting
		
		Collections.sort(li,Collections.reverseOrder());
		
		System.out.println("Sorting the lements in reverse order :" +li);
		
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		
		Collections.shuffle(li);
		System.out.println("Elements after shuffling :" +li);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
