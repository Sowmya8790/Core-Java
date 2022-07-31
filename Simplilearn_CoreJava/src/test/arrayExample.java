package test;

public class arrayExample {

	public static void main(String[] args) {
		
	/*	int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50; n */
		
		int[] a= {1,2,3,4,5,6};
		System.out.println("total numbs are"+" "+a.length);
		System.out.println("the second number"+" "+a[1]);
		System.out.println("the last number"+" "+a[a.length -1]);
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
		String[] cars= {"BMW","KIA","HUNDAI"};
		System.out.println("total string are"+" "+cars.length);
		System.out.println("the second string"+" "+cars[1]);
		System.out.println("the last string"+" "+cars[cars.length -1]);
		
		String s="Clean world Green World";
		String array[]= s.split(" ");
		System.out.println(array[3]);
		
		
		//reverse a String
		
		
		
		for(String st:array)
		{
			System.out.println(st);
		}

	}

}
