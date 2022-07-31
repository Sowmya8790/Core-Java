package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue();  //Stores homogeneous data
		
		q.add('A');
		q.add('D');
		q.add('B');
		q.add('C');
		
		System.out.println(q);
		
		PriorityQueue q1=new PriorityQueue(); 
		
		//Element it element the value in head.
		
		System.out.println(q.element());
		//System.out.println(q1.element());
		
		//peek it retrive headder value the diff bw Element & peek is it shows nll if there is no data remove shows exception.
		
		System.out.println(q.peek());
		System.out.println(q1.peek());
		
		//Remove it remove the elment
		System.out.println(q.remove());
		//System.out.println(q1.remove()); //Throws exception
		System.out.println(q);
		
		//Poll it remove the element
		
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q1.poll());
		
		Iterator it= q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Object o: q)
		{
			System.out.println(o);
		}
		
		
		

	}

}
