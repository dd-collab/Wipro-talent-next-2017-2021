import java.util.Arrays;


public class FrequentEle {
	static int Rep(int a[],int num)
	{
		Arrays.sort(a);
		int count1=1;int res = a[0];
		int count0=1;
		for(int i=1;i<num;i++)
		{
			if(a[i]==a[i-1])
			{
				count0++;
			}
			else
			{
				if(count0>count1)
				{
					count1=count0;
					res=a[i-1];
				}
				count0=1;
				
			}
			
		}
		if(count0>count1)
		{
			count1=count0;
			res=a[num-1];
			
		}
		return res;
	}
	

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,4,9};
		int num=a.length;
		System.out.println(Rep(a,num));
		

	}

}
