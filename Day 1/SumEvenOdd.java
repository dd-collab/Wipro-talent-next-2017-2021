import java.util.Scanner;
public class SumEvenOdd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int num1=sc.nextInt();
         int num2=sc.nextInt();
         int num=num1+num2;
         if(num%2==0)
         {
            System.out.println("Sum is Even number"); 
         }
         else
         {
             System.out.println("Sum is Odd number");
         }
	}
}
