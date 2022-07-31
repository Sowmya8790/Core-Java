package Practise;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSortArray {

	public static void main(String[] args) {
		
		int a[] = {9,4,7,1,4,2,8};
		
		System.out.println("Element before sorting :" +Arrays.toString(a));
		
		for(int i=0;i<a.length -1;i++)
		{
			for(int j=0;j<a.length -1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j] =a[j+1];
					a[j+1] =temp;
				}
				
			}
		}
		
		System.out.println("The elements after sorting: " +Arrays.toString(a));
		
		Integer b[] = {9,4,7,1,4,2,8};
		
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println("Array in reverse order" +Arrays.toString(b));
			

	}

}
