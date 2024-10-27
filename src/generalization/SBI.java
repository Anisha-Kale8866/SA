package generalization;

public class SBI implements RBI
{

	@Override
	public void savingAccoungt() 
	{
		System.out.println("SBI saving ACC intrest rate is 7%");
	}

	@Override
	public void FD() 
	{
		System.out.println("SBI FD  intrest rate is 10%");
	}

	@Override
	public void loan() 
	{
		System.out.println("SBI Loan intrest rate is 8.9%");		
	}
	
	public void yono()
	{
		System.out.println("SBI YONO mobile banking app");
	}

}
