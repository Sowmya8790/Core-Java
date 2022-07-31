package SingleDimentionalArray;

public class ArrayStringEX3 {

	public static void main(String[] args) {
		
		String a="Hello";
		
	// Length
		System.out.println(a.length());
		
	// Concatination
		String a1="World";

		System.out.println(a+"  "+a1);
		System.out.println(a.concat(a1));
	//equals()
		
		String a2 = "HELLO";
		
		System.out.println(a.equals(a2)); //False
	// equalIgnore Case
		
		System.out.println(a.equalsIgnoreCase(a2)); //True
	//SubString
		
		System.out.println(a.substring(1, 4));
		
	//replace()
		System.out.println(a.replace('o','q'));
	}

}
