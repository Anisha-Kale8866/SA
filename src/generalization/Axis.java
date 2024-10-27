package generalization;

public class Axis implements RBI
{

	@Override
	public void savingAccoungt() 
	{
		System.out.println("Axis saving ACC intrest rate is 8.9%");		
	}

	@Override
	public void FD() 
	{
		System.out.println("Axis FD intrest rate is 11%");		
	}

	@Override
	public void loan() {
		System.out.println("Axis loan intrest rate is 11.99%%");		
	}
	
	public void cashDepositMachine() 
	{
		System.out.println("Axis CDM machine");
	}

}
