import java.util.*;
public class AlphaDigitSpecial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch>=48 && ch<=57)
		{
			System.out.print("Digits");
		}
		else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.print("Alphabets");
		}
		else
		{
			System.out.print("Special characters");
		}
	}

}
