package interfaceStudy;

public class Son implements Father, Mother {

	public static void main(String[] args) 
	{
		Son s= new Son();
		s.care();
		s.love();
		s.nature();
		s.receipe(); 
		s.money();         // calling same method override by ...using default
		Father.property(); //calling static method from father Interface
		
		

	}

	@Override
	public void receipe() 
	{
		System.out.println("Mothers receipe comleted in Sons class");
		
	}

	@Override
	public void care() 
	{
		System.out.println("Mothers care comleted in Sons class");
	}

	@Override
	public void love() 
	{
		System.out.println("Fathers love comleted in Sons class");
	}

	@Override
	public void nature() 
	{
		System.out.println("Fathers nature comleted in Sons class");
	}

	@Override
	public void money() 
	{
		System.out.println("Sons money");
	    Father.super.money(); // super keyword is used to resolve calling issue
		Mother.super.money();
		
	}

	

	

 }
