package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
		
		LinkedList ll = new LinkedList<>();
		
		ll.add("Pune");
		ll.add("Pune");
		ll.add(null);
		ll.add(null);
		ll.add(123);
		ll.add(12.12);
		ll.add('A');
		ll.add(true);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains("Velocity"));
		System.out.println(ll.get(2));
		System.out.println(ll.indexOf('A'));
		
		System.out.println("======================================sys");
		
		System.out.println(ll.peek());         //Retrieves, but does not remove, the head (first element) of this list.
		                                       ////the head of this list, or null if this list is empty
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.poll());             //Retrieves and removes the head (first element) of this list.
		                                           //the head of this list, or null if this list is empty 
		System.out.println(ll);
		System.out.println(ll.pop());       //Pops an element from the stack represented by this list. In otherwords, removes and returns the first element of this list. 
                                            //NoSuchElementException - if this list is empty
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.remove());   // removed first if index not given here it is "null".......................my point
		System.out.println(ll);
		
		System.out.println("======================================");
		//for loop  ///////// for
		//for each  //////// for
		//listiterator  /////// while
		
		for(int i=0; i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("======================================");
		
		 ListIterator lil = ll.listIterator();
				 
		 while (lil.hasNext())
		 {
			 System.out.println(lil.next());
			 
		 }
		 
		 System.out.println("======================================");
		 
		 for(Object each :ll)
		 {
			 System.out.println(each);
		 }
		 
		 
			
			
		
		
		
	}

}
