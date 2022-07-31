package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 //Array to array List
 		
 		      String[] ani= {"Sowj","Cat","Dog","Lion"};
 		      
 		      for(String h:ani)
 		      {
 		    	  System.out.println(h);
 		      }
 		      
 		      //Array to ArrayList
 		      ArrayList al=new ArrayList(Arrays.asList(ani));
 		      
 		      System.out.println("Converting array to array list:" +al);
 		
 		
	}

}
