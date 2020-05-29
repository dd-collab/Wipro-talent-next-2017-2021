import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateRemove {
	
	public static int dupli(int a[],int num) {
		if(num==0||num==1)
		{
			return num;
		}
		int[] arr=new int[num];
		int m=0;
		
		for(int i=0;i<num-1;i++)
		{
			if((a[i])!=a[i+1])
			{
				arr[m++]=a[i];
			}
		}
		arr[m++]=a[num-1];
		for(int i=0;i<m;i++)
		{
			a[i]=arr[i];
	

		}
		return m;
	}

	public static void main(String[] args) {
		int a[]= {10,70,30,90,20,20,30,40,70,50};
		Arrays.sort(a);
		int len=a.length;
		len=dupli(a,len);
		for (int i=0;i<len;i++)
		{
			System.out.print(a[i]+"'");
		}
		

	}

}
