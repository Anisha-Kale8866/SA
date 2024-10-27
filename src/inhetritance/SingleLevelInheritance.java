package inhetritance;

public class SingleLevelInheritance {

	public static void main(String[] args) 
	{
		// To call mothers non static property i need mothers object
		
		Mother m=new Mother();// Created object object of mother class
		
		// To call child non static property i need child object
		
		Child c=new Child();// Created childs object
		
		m.nature();// calling mothers property
		Mother.care(); // calling mothers property
		
		c.mobile();
		Child.laptop();
		//
		c.nature(); // By using childs object we are calling mothers property (Non-static)
		Child.care(); // By using childs class name we are calling mothers property(static)
		Child.laptop();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
