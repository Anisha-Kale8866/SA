package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// Declaring multiple method with same method name .........but with
		// different argument in the same class is called method overloading.

		MethodOverloading mo= new MethodOverloading();// Object created
		mo.add();															 //@MyPoint   same class -->objectname.methodname 
		mo.add(50, 100);
		mo.add(20, 40, 60);
		
		
	}
	
	public void add() //zero parameter
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	public void add(int a, int b) //double parameter
	{
		int sum= a+b;
		System.out.println("sum is "+sum);
	}
	
	public void add(int a, int b, int c) //triple parameter
	{
		int sum= a+b+c;
		System.out.println("sum is "+sum);
	}

}
