import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		int range,sum=0;
		float average;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range:");
		range=s.nextInt();
		int a[]=new int[range];
		for(int i=0;i<=range-1;i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum="+sum);
		average=(float)sum/range;
		System.out.println("Average="+average);
	
		

	}

}
