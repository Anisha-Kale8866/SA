package accessSpecifiers;

public class Sample {

	public static void main(String[] args) 
	{
		PrivateUse p= new PrivateUse();//created object of another class
	  //p.test1(); we can't call private method outside the class
	    p.test2();
	    p.test3();
	    p.test4();
	    
	    
	}

}
