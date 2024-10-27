package accessSpecifiers;

public class PrivateUse {

	public static void main(String[] args) 
	{
		PrivateUse pu= new PrivateUse();
		pu.test1();//calling private method
		pu.test2();//calling default method
		pu.test3();//calling protected method
		pu.test4();//calling public method

		
		
	}
	
	private void test1()//only within the class.It can't be access from another class
	{
	    System.out.println("Hi this is test1 Private Method");
	}
	
	void test2()//remains only within the package.
	{
		System.out.println("Hi this is test2 default Method");
	}

	protected void test3()//remains only within the package, Inheritance-->outside of package
	{
		System.out.println("Hi this is test3 protected Method");
	}
	
	public void test4()//Throughout the project 
	{
		System.out.println("Hi this is test4 public Method");
	}
 	
    



  }







