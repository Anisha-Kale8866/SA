package abstractClass;

public class CC extends AbstractSyudy{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CC c= new CC();
		c.test();
		c.test1();
		c.test2();
		c.sample();

	}

	@Override
	public void test() 
	{
		System.out.println("This method is completed in concrete class");
		
	}

	public void sample()
	{
		System.out.println("This is own method of Cc");
	}
	
	 
}
