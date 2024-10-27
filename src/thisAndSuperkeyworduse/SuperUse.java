package thisAndSuperkeyworduse;

public class SuperUse extends ThisUse {
	
	int a=500;// not-static global variable(from subclass)

	public static void main(String[] args) 
	{
		SuperUse su= new SuperUse();
		su.sub();
//		
	}
	
	public void sub()
	{
		int a=800;
		int sub=a-70;// using local variable
		System.out.println("sub is "+sub);
		
		int sub1=this.a-70;// using global value of 'a' from same class              //@MyPoint same  -->this.globalvalue/variable
		System.out.println("sub1 is "+sub1);
		
		int sub2=super.a-70;//using global value of 'a' from super class 			 //@MyPoint another   -->super.globalvalue/variable
		System.out.println("sub2 is "+sub2);
		
		
	}

}
