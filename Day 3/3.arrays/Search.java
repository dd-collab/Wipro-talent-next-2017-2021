import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int range,search,i;
		Scanner s=new Scanner(System.in);
		range=s.nextInt();
		int a[]=new int[range];
		for( i=0;i<=range-1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the number to search:");
		search=s.nextInt();
		for( i=0;i<=range-1;i++)
		{
			if(a[i]==search)
			{
				System.out.println(i);
				break;
			}
			
		}
		
		if(i==range)
		{
			System.out.println("-1");
		}
		
		

	}
