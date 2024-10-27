package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
//		best choice: To remove duplicate elements when order of insertion is mandatory
		
		LinkedHashSet hs = new LinkedHashSet();
		
		hs.add("Pune");             //Doesn't allow duplicate values & order of insertion-maintained
		hs.add("Pune");
		hs.add('A');
		hs.add(null);               //Allow only 1 null value.
		hs.add(null);
		hs.add(1);
		hs.add(12.12);
		hs.add(true);
		
        System.out.println(hs);
	}

}
