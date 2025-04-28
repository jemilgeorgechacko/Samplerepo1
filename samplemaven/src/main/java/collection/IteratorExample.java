package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
	public static void main(String args[])
	{
		Set<String>s=new HashSet<String>();
		s.add("orange");
		s.add("red");
		s.add("blue");
		s.add("yellow");
		Iterator it=s.iterator();
		while(it.hasNext());
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(s);
		
	}
}
