package Pattern_Programming;

public class Eg4_Triangle_Left_Ascending {

	public static void main(String[] args) 
	{
		
//		*
//		**
//		***
//		****
//		*****
		
//		Step1: count no of ==>> R=5 C=5 
		
//		Always Start with Rows - (Outer Loop)
		
		int star=1;  // write no of star(*) in step 1		
     
		for(int i=1;i<=5;i++)  // outer loop for rows (rows count) , here rows are =5
		{

			for(int j=1;j<=star;j++) // inner loop for columns (columns count) , here columns are =5
			{
				System.out.print("*");   //Note : use only (print) 
			}
			System.out.println();  //on next line use sprintln 
			star++;
		}

	}

}
