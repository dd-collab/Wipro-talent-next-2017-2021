import java.util.Scanner;

public class PositiveOrNegative {
   public static void main(String args[]){
      int num;
      System.out.println("Enter a number ::");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();

      if (num > 0){
         System.out.println("A positive integer");
      } else if(num < 0){
         System.out.println("A negative integer");
      } else {
         System.out.println(" zero");
      }
   }
}
