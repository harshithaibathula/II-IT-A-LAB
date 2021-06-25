import java.util.Scanner;
class Revstring {
   public static void main(String args[])
   {
      String reverseString="";
      Scanner inpstr = new Scanner(System.in);
      String inputString = inpstr.nextLine();

      int length = inputString.length();

      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverseString = reverseString + inputString.charAt(i);
      
      System.out.println("Given string in reverse order:- "+reverseString);

   }
}