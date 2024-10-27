package collection;

import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
//		note: we can store only homogeneous data
//		ClassCastException

		
		TreeSet t = new TreeSet();
		
		t.add(12);
		t.add(12);           //  . doesn't allow duplicate 
//		t.add('A');         // java.lang.ClassCastException= class java.lang.Integer cannot be cast to class java.lang.Character///////int
		t.add(1);
		t.add(101);
		t.add(8);
		t.add(3);
//		t.add(null);      //. null values: not allowed// NullPointerException
		
		System.out.println(t);    //order of insertion- Asscending order
		
		
		
	}

}
