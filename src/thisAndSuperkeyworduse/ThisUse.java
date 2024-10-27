package thisAndSuperkeyworduse;

public class ThisUse {

	int a=100;//Non-static global variable
	int b=600;
	static int c=10;// static global variable
	
	public static void main(String[] args) 
	{
		ThisUse t= new ThisUse();
		t.addition();
		
	}
	
	
	public void addition()
	{
		int a=10;//local variable
	//	static int x =200;// we can't create static variable with same name in same class
		int sum=a+900;// a value will be refferd as local value '10'
		System.out.println("Addition is "+sum);
		
		int sum1=this.a+900;// calling global value of a using 'this' keyword      //@MyPoint    -->this.globalvalue/variable
		 
		System.out.println("Addition1 is "+sum1);
		 
		System.out.println("Local value of a is "+a);
		System.out.println("Global value of a is "+this.a);
		
	
		
		
		
	}

}
