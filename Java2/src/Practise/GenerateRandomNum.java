package Practise;

import java.util.Random;

public class GenerateRandomNum {

	public static void main(String[] args) {
		
		Random ram =new Random();
		
		int rand=ram.nextInt(1000); //Ptints random number b/w 1-1000
		System.out.println(rand);
		
		double rand_1=ram.nextDouble();
		System.out.println(rand_1);   //If nothing given then it prints b/w 0-1
	}

}
