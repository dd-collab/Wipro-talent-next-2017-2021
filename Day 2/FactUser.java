import java.util.*;
import java.io.*;
public class FactUser
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Number to which you need to find the factorial:");
         int n=sc.nextInt();
         int fact=1;
         for(int i=1;i<=n;i++)
         {
             fact=fact*i;
         }
         System.out.print("Factorial of the given number ");
         System.out.print(n + " is:" +fact);
    }
}
