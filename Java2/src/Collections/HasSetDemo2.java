package Collections;

import java.util.HashSet;

public class HasSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> ha=new HashSet<Integer>();
		
		ha.add(2);
		ha.add(4);
		ha.add(6);
		
		System.out.println("the variables in set :" +ha);
		
		HashSet<Integer> ha_1=new HashSet<Integer>();
		
		ha_1.addAll(ha);
		ha_1.add(10);
		
		System.out.println("Adding elements in one col to this object :" +ha_1);
		
		//removeALL
		ha_1.removeAll(ha);
		System.out.println("The elemt remoeved :" +ha_1);
		
		
		
		
	}

}
