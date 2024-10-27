package methods;

public class Non_staticMethodStudy {

	public static void main(String[] args) 
	{
	    //classname objectname= new classname();
		//to Non Static method--> objectname.methodname();
		//Creating object
		
      Non_staticMethodStudy obj= new Non_staticMethodStudy();
      
      obj.display(); // callinfg non static method from same class
      
     //.........................................................//
      
      MyClass_NSM m=  new  MyClass_NSM(); // create object of another class
      
      m.running(); // calling non static method from another class
	}

    public void display()	
    {	
	   System.out.println("Hi this is Non-static method");
    }
    
}
