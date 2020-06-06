import java.util.Scanner;

public class SumElem {

	public static void main(String[] args) {
		int result=0, range;
		Scanner s= new Scanner(System.in);
		range=s.nextInt();
		int a[]=new int[range];
		for(int i=0;i<range-1;i++)
		{
			a[i]=s.nextInt();
		}
		for (int i=0; i<n.length-1; i++) {
		    if (n[i]==6 && n[i+1]==7) {
		         continue;
		     }
		     else{
		        result+=n[i];
		     }
		}
		System.out.println(result);

	}

}
