package exception;

public class AirthmaticExp {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		System.out.println(a);
		System.out.println(b);
		
		try 
		{
		  System.out.println(a/b);  //risky code
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("we cant divide by zero. please check value of b");
		}
		
//		System.out.println("Ans is ");
		
	}

}
