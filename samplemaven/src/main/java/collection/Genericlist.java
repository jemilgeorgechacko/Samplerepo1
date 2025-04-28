package collection;

import java.util.ArrayList;
import java.util.List;

public class Genericlist {
	public static void main(String args [])
	{
		//List<String>s=new ArrayList<String>();
		ArrayList<String>s=new ArrayList<String>();
		s.add("apple");
		s.add("orange");
		s.add("grapes");
		s.add("banana");
		s.add("avacado");
		System.out.println(s);
		System.out.println(s.get(3));
		s.set(0,"greenapple");
		System.out.println(s);
		System.out.println(s.indexOf("greenapple"));
		System.out.println(s.lastIndexOf("banana"));
		s.remove(3);
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.contains("avacado"));
		System.out.println(s.size());
		
		
		
		
		
	}

}
