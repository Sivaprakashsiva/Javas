import java.util.*;
 
class StringRev
{
   public static void main(String args[])
   {
      String str;
      String str1 = "";
      Scanner s = new Scanner(System.in);
 
      System.out.println("Enter a string to reverse");
      str = s.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         str1 = str1 + str.charAt(i);
 
      System.out.println("Reverse of entered string is: "+str1);
   }
}
