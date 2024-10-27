	package variable_types;

public class GlobalVariable {
	
	int a=10; //Global non static variable
	static int b=90; //Global static variable

	public static void main(String[] args) 
	{
	 GlobalVariable gv= new GlobalVariable();// create object in same class 
	 gv.test();// calling non static method
	 test1();// calling static method
	 System.out.println("value of a is "+gv.a);// calling non static global variable-->objectname.variablename 
	 System.out.println("value of b is "+b);// calling static global variable from same class-->variable name
	 
	 //calling non-static global variable from another class
	 Sample s= new Sample();// created object from another class
	 System.out.println("global non-static variable from another class is "+s.p);        //@MyPoint   another class -->objectname.variablename 
	 
	//calling static global variable from another class
	 System.out.println("global variable from another class is "+Sample.q);              //@MyPoint    another class -->methodname.variablename 
	 
	 int sub=800-gv.a;// using non-static global variable from same class
	 int sub1=900-b;// using static global variable from same class
	 
	 int sub2=1000-s.p;// using non-static global variable from another class
	 int sub3=3000-Sample.q;// using static global variable from another class
	 
	 System.out.println("sub is "+sub);
	 System.out.println(sub1);
	 System.out.println(sub2);
	 System.out.println(sub3);

	}
	
	public void test()// Non Static Method
	{
		int sum=a+10; // we can call non static global variable
		int sub=b-10; // we can call static global variable
	}
	
	public static void  test1()// Static Method
	{
		//int sum=a+10;// we cant call non-static global variable
		//...@MY point.........not call due to non static....... ***note: 1 can't initialise non static into static method /variable**** 
		
	    int sub=b+10;// we can call static variable
	    
	}

}
