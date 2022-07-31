package Practise;

import java.util.Arrays;

public class AttayBinarySearch {

	public static void main(String[] args) {
		
		// for binary search the elements should be in sorted order then oly we can perform binary search
		
	/*	key==mid
		key>mid l=mid+1
		key<mid  h=mid-1
		
		l should not greater than h*/
		//compared to linear search binary is faster.
		
		int a[]= {10,20,30,40,50,60,70,80,90};
		
		int l=0;
		int h=a.length -1;
		int m=0;
		int key=80;
		boolean flag= false;
		
		while(l<=h)
		{
			m=(l+h)/2;
			
			
			if(key==a[m])
			{
				System.out.println("The given number present in the array :" +a[m]);
				flag=true;
				break;
			}
			if(key>m)
			{
				l=m+1;
			}
			if(key<m)
			{
				h=m-1;
			}
		}
		if(flag==false)
		{
		System.out.println("The given number not found in array :" +key);
		}
		
		//appproch 2
		
	     System.out.println(Arrays.binarySearch(a, 80));
		

	}

}
