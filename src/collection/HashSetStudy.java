package collection;

import java.util.HashSet;

public class HashSetStudy {

	public static void main(String[] args) {
		
//		Use====best choice: To remove duplicate elements when order of insertion is not mandatory.
		
		HashSet hs = new HashSet();
		
//		System.out.println(hs.add("Pune"));                 true
//		System.out.println(hs.add("Pune"));                 false
		
		hs.add("Pune");           // Doesn't allow duplicate values & order of insertion-random insertion
		hs.add("Pune");
		hs.add(null);             //. Allow only 1 null value.
		hs.add(null);
		hs.add(123);
		hs.add(12.13);
		hs.add(true);
		hs.add('A');
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		//size, capacity, contains
		
		//for loop
		//for each
		//iterator
		
		//try hashSet of type integer and String
		
	}

}
