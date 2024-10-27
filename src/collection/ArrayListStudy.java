package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("Velocity");
		al.add('A');
		al.add("Velocity");
		al.add(null);
		al.add(null);
		al.add(123);
		al.add(123.13);
		al.add(true);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Velocity"));
		System.out.println(al.get(2));
		System.out.println(al.lastIndexOf('A'));
		System.out.println(al.remove(2));
		System.out.println(al);
		
		al.add(2, "Pune");
		System.out.println(al);
		
		System.out.println("==============================================");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("================================================");
		
		Iterator it = al.iterator();
	
	    while (it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    
	    System.out.println("================================================");
	    
	    ListIterator lit = al.listIterator();
	    
	    while(lit.hasNext())
	    {
	    	System.out.println(lit.next());
	    }
	    
	    System.out.println("================================================");
	    
	    for(Object h:al)
	    {
	    	System.out.println(h);
	    }
	    
	    
	   
	    System.out.println("================================================");
	    
	    ArrayList<Character>ac = new ArrayList<>();
	    
	    ac.add('A');
	    ac.add('B');
	    ac.add('C');
	    ac.add('D');
	    ac.add('E');
	    
	    Iterator<Character> it1 = ac.iterator();
	    
	    while(it1.hasNext())
	    {
	    	System.out.println(it1.next());
	    }
	    
	    
	    
	    
		
	}

}
