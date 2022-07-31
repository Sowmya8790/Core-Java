package test;

  
class ReverseString {
    public static void main (String[] args) {
        
      String str= "Geeks" ,rev=" ";
        
        
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
        
      for (int i=str.length() -1; i>=0; i--)
      {
        rev=rev+str.charAt(i);
      }
      System.out.println("the reverse word:" +rev);
      
    }
}
    	
    	

