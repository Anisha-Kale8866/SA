package FinalKeywordUse;

public final class Test {

	public static void main(String[] args) 
	{
		int a=10;
		a=a+20;
		System.out.println("a value is "+a);
		
		
		final int b=20;
        //b=b+20;   If we make any variable as final then we can't update the value again (can't update variable).
		int sum=a+b;
		System.out.println();
		
	}
	
	public final void demo()
	{
		System.out.println("Hi I am the demo method of Test Class");
	}

}
