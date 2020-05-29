import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		int range,max,min;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the range:");
		range=s.nextInt();
		int a[]=new int[range];
		for(int i=0;i<=range-1;i++)
		{
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=0;i<=range-1;i++)
		{
			if(max>a[i])
			{
				max=a[i];
			}
		}
		System.out.println("the maximum number is "+max);
		min=a[0];
		for(int i=0;i<range-1;i++)
		{
			if(min<a[i])
			{
				min=a[i];
			}
		}
		System.out.println("the minimum number is "+min);
		

	}

}
