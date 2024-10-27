package interfaceStudy;

public class MyClass implements MyInterface{

	public static void main(String[] args) 
	{
		MyClass m= new MyClass(); // created object implementation class
		
		m.test();
		m.test1();
		m.myMethod();
//		a=a+10; we can't update variable from interface
		System.out.println("value of a is "+a);
	
		
	}

	@Override
	public void test() 
	{
		System.out.println("Hi this is test method comleted in implementation Class");
	
	}

	@Override
	public void test1() 
	{
		System.out.println("Hi this is test method comleted in implementation Class");		
	
    }
	
	public void myMethod()
	{
	   System.out.println("Hi this is myMethod - Own (myClass) in implementation Class");	
	}

}
