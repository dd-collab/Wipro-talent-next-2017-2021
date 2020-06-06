import java.util.Arrays;
import java.util.Scanner;

public class Arrange {

	public static void main(String[] args) {
		int range,i;
		Scanner s = new Scanner(System.in);
		range=s.nextInt();
		int a[]=new int[range];
		for(i=0;i<=range-1;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.parallelSort(a);
		for(i=0;i<=range-1;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
