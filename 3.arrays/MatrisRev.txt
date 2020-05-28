public class MatrixRev {

	public static void main(String[] args) {
		int len=args.length;
		int i,j,k,l;
		int a[][]=new int[4][4];
		if(len<4)
		{
			System.out.println("enter the required 4 number");
		}
		if(len==4)
		{
			k=0;
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("the given matrix is:");
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					System.out.print(a[i][i]+" ");
				}
				System.out.println();
			}
			System.out.println("The reverse matrix is:");
			for(i=1;i>=0;i--)
			{
				for(j=1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
