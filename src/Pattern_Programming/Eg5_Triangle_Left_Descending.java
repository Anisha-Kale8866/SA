package Pattern_Programming;

public class Eg5_Triangle_Left_Descending {

	public static void main(String[] args) 
	{
//		*****
//		****
//		***
//		**
//		*

		
//		Step1: count no of ==>> R=5 C=5 
		
//		Always Start with Rows - (Outer Loop)
		
		int star=5;  // write no of star(*) in 1st row	
     
		for(int i=1;i<=5;i++)  // outer loop for rows 
		{
			for(int j=1;j<=star;j++) // inner loop for columns 
			{
				System.out.print("*");   //Note : use only (print) 
			}
			System.out.println();  //on next line use sprintln 
			star--;
		}

	}

}
