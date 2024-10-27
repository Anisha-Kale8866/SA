package testing_As;

import accessSpecifiers.PrivateUse;

public class Velocity extends PrivateUse{

	public static void main(String[] args) 
	{
		PrivateUse p= new PrivateUse();//created object of another class
		p.test4();//calling public method
      //p.test3();//can't call protected method from another package
		
		Velocity v= new Velocity();//created object of child class
		v.test3();//calling protected method from another package using extend 32
		v.test4();//calling public method from another package
	    
		
		
		
		
		
		
		

	}
//
}
