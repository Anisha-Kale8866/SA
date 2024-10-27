package constructor;

public class Hr_Portal {

	public static void main(String[] args) {
		
		Employee SachinT = new Employee();
		
		SachinT.emp_name="Sachin tendulkar";
		SachinT.emp_id=10;
		SachinT.emp_dept="Batting";
		SachinT.emp_sal=12345.1234f;
		SachinT.gender='M';
		
		Employee Zaheer = new Employee();
		
		Zaheer.emp_name="Zaheer Khan";
		Zaheer.emp_id=1;
		Zaheer.emp_dept="Bowling";
		Zaheer.emp_sal=123.123f;
		Zaheer.gender='M';
		
		Employee Subodh =new Employee();
		
		Subodh.emp_name=" Subodh Adav";
	    Subodh.emp_id=20;
	    Subodh.emp_dept= "Mechanical";
	    Subodh.emp_sal=18000.00f;
	    Subodh.gender= 'M';
	    
	    SachinT.emp_info();
	    Zaheer.emp_info();
	    Subodh.emp_info();
	    
		
	}

}
