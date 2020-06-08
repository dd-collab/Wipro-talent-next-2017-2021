import java.util.*;

public class DivisionException {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		try
		{
			double q=division(x,y);
			System.out.println(q);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

	}
	public static float division(int x,int y) throws ArithmeticException{
		return x/y;
		
	}

}
