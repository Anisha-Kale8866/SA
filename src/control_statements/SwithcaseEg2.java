package control_statements;

public class SwithcaseEg2 {

	public static void main(String[] args) {
		// PNQ--> Welcome to Pune Airport
		//BOM--> Welcome to Mumbai Airport
		//NGP--> Welcome to Nagpur Airport
		
		String City="America";
		
		switch (City) {
		case "PNQ":System.out.println("Welcome to Pune Airport");
			break;
			
		case "BOM":System.out.println("Welcome to Mumbai Airport");
		    break;
		    
		case "NGP":System.out.println("Welcome to Nagpur Airport");
		    break;
		    
		default:System.out.println("Please enter valid City between Pune Mumbai & Nagpur");
			break;
		}
		
	}

}
