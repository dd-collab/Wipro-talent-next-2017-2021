import java.util.Scanner;
 class PalindromeOrNot
{
   public static void main(String args[])
   {
      String st, rev = "";
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      st = sc.nextLine();
  int length = st.length();
   for ( int i = length - 1; i >= 0; i-- )
         rev = rev + st.charAt(i);
      if (st.equals(rev))
         System.out.println(st+" is a palindrome");
      else
         System.out.println(st+" is not a palindrome");
    }
}
