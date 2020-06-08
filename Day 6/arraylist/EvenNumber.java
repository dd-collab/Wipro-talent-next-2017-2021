import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenNumber<list> {
	public ArrayList<Integer> list=new ArrayList<Integer>();
	public ArrayList<Integer> saveEvenNumber(int a)
	{
		list=new ArrayList<Integer>();
		for(int i=2;i<a;i++) {
			if(i%2==0)
			{
				list.add(i);
			}
		}
		return list;
	}
	public ArrayList<Integer> printEvenNumber()
	{
		ArrayList<Integer> nlist=new ArrayList<Integer>();
		for(int item:list)
		{
			nlist.add(item*2);
			System.out.println(item*2);
		}
		
		return nlist;
		
	}

	public static void main(String[] args) {
		EvenNumber in=new EvenNumber();
		in.saveEvenNumber(10);
		in.printEvenNumber();
	}

}
