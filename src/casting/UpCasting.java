package casting;

public class UpCasting {

	public static void main(String[] args) 
	{
		
		Father f= new Father();
		Son s= new Son();
		
		f.bike();
		f.car();
		s.bike();
		s.car();
		
		Son f1=new Son();
		System.out.println("================");
		f1.bike();
		f1.car();
		
		

	}

}
