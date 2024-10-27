package exception;

public class Try_Catch_Finally {

	public static void main(String[] args) 
	{
		String a = "abc";
		
		try 
		{
			System.out.println(a.charAt(10));  //risky code 
			
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("Check the index, it should be between 0 to 2");
		}
		finally
		{
			System.out.println("Finally block is running");
		}
		
	}

}
