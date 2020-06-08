import java.util.HashSet;
import java.util.Iterator;

public class Assignment2 {

	public static void main(String[] args) {
		HashSetString set = new HashSet();
		
		set.add(Bob);
		set.add(Alice);
		set.add(John);
		set.add(Richard);
		
		IteratorString it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
