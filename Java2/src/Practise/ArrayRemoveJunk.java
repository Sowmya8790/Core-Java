package Practise;

public class ArrayRemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "!@#$%^&* ling king java 912356789023 ";
		System.out.println("Befpore remoeving :" +s);
		
		
		//The below expression is for all chars numbers aprat from these remaining are special chars ^ indicates character.
		s= s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
		
		
		
		
		
		
	}

}
