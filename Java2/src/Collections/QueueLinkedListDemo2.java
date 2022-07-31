package Collections;

import java.util.LinkedList;

public class QueueLinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add(100);
		l.add("Sowmya");
		l.add('C');
		l.add('C');
		l.add('A');
		
		System.out.println(l);
		
		LinkedList l1=new LinkedList();
		
		//element()
		
		System.out.println(l.element());
		//System.out.println(l1.element());  Excpetion
		
		//Peek()
		System.out.println(l.peek());
		System.out.println(l1.peek());
		
		//remove()

		System.out.println(l.remove());
		//System.out.println(l1.remove());  Exception
		
		//poll()
		System.out.println(l.poll());
		System.out.println(l1.poll());
		

	}

}
