import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		
		print(list);

	}
	
	public static void print(ArrayList<String> list)
	{
		Iterator<String> it= list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	}
