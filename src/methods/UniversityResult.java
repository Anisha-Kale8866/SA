package methods;

public class UniversityResult {

	public static void main(String[] args)
	{
	 
		UniversityResult ur= new UniversityResult();
	    ur.studentInfo();
	    ur.studentInfo1("Trisha", 123, 'b', 100.78d);
        ur.studentInfo1("India", 111, 'A', 100.00d);
        
        //my practixe ex.
        
        ur.studentInfo1("abhay",123, 'B', 200.26d);
        ur.studentInfo1("vaibhav", 456, 'j', 200.455d);
	}
	
	public void studentInfo()// method without prameters
	{
        //name, rollnum, grade, totalmark
		
		String studentName= "Subodh"; //1+2
		int rollnum=1234;
		char grade= 'A';
		float totalMarks=99.88f;
	    System.out.println("==================================");	
		System.out.println("Student name is "+studentName);
		System.out.println("student rollnum is "+rollnum);
		System.out.println("student grade is "+grade);
		System.out.println("student's marks are "+totalMarks);
		 System.out.println("==================================");	
    }
	
	    //name, rollnum, grade, totalmarks
	
	 public void studentInfo1(String studentName, int rollnum, char grade, double totalMarks)
	 {
		 
		System.out.println("=======================================");
		System.out.println("Student name is "+studentName);
		System.out.println("student roll num is "+rollnum);
		System.out.println("student grade is "+grade);
		System.out.println("student's marks are "+totalMarks);
		System.out.println("=======================================");
		
	
	 }
	
	
	
	
	
	
	

}