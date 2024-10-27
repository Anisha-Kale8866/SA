package generalization;

public class Generalization {

	public static void main(String[] args) 
	{
		
		SBI s= new SBI();
		Axis a= new Axis();
		
		System.out.println("====================");
		s.savingAccoungt();
		s.FD();
		s.loan();
		s.yono();
		System.out.println("====================");
		
		System.out.println("====================");
		a.savingAccoungt();
		a.FD();
		a.loan();
		a.cashDepositMachine();
		System.out.println("====================");
		
	
	}

}
