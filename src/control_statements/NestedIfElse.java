package control_statements;

public class NestedIfElse {

	public static void main(String[] args) {
		// If username is correct--> Enter password
//      {
//		     If-->  password is correct --> login Success     
//		     else --> Enter correct password
//      }
		//else --> Enter correct username
		
		String UN="Velocity";
		String PWD="Velocity@123";
				
	    if(UN=="Velocity")
	    {
          System.out.println("Enter Password");
          
          if(PWD=="Velocity@123")
          {
        	System.out.println("login Success");  
          }
          else
          {
           System.out.println("password is incorrect");
          }
	
	    }
	    
	    else
	    {
	    	System.out.println("Please enter correct password");
	    }
	    
	    
	    
	    
	    
	    
	}
	
}
	  
