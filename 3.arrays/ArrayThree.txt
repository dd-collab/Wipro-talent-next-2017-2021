public class ArrayThree {

	public static void main(String[] args) {
		int len=args.length;
		int i,j,k,l;
		int a[][]=new int[9][9];
		if(len<9)
		{
			System.out.println("enter the required 9 number");
		}
		if(len==9)
		{
			k=0;
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("the given matrix is:");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(a[i][i]+" ");
				}
				System.out.println();
			}
			System.out.println("The reverse matrix is:");
			for(i=2;i>=0;i--)
			{
				for(j=2;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
