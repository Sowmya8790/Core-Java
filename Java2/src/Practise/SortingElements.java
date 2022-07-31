package Practise;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {50,30,72,83,20,98};
		
		
		System.out.println("The array befor sorting " +Arrays.toString(a));
		
	/*	Arrays.parallelSort(a);
		System.out.println("The element after sorting " +Arrays.toString(a));*/
		
		//Approch 2 Using SORT
		
	/*	Arrays.sort(a);
		System.out.println("The elements after sorting :" +Arrays.toString(a)); */
		
		//Using Reverse sorting
		
		
		Integer b[]= {50,30,72,83,20,98}; // here use Integer instead of int as collections is not premitive type these are user defined Interfaces.
		
		Arrays.sort(b, Collections.reverseOrder());
		
		System.out.println("The element after sorting :" +Arrays.toString(b));
		
		
		
		
		
		
		

	}

}
