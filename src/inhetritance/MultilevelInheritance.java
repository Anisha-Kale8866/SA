package inhetritance;

public class MultilevelInheritance {

	public static void main(String[] args)
	{
		GrandMother gm=new GrandMother();
		gm.receipe();// calling own property
		
		Mother m=new Mother();
		m.receipe();// calling superclass method using subclass object
		m.nature();// calling own property
		Mother.care();// calling own static property
		
		Child c= new Child();
		c.receipe();// calling supermost class property using child's object
		c.nature();// calling super class property using child's object
		c.mobile();// calling own property
		
		Child.Stories();// calling supermost class static property using child's class
		Child.care(); // calling super class static property using child's class
		Child.laptop();// calling own property
		
		
		
		
		
		
		
		

	}

}
