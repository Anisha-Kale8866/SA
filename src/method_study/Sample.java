package method_study;

public class Sample {

	public static void main(String[] args) {
		
		System.out.println("main method is running");
        demo(); // static method call from same class
        
        //to call static method from same class---> directly call static i.e. methodname();
        
	}
 public static void demo()  // defining static method 
    {  
	 System.out.println("Hi i am demo method from samle class");
	 
 }
}
		
		