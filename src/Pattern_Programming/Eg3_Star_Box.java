package Pattern_Programming;

public class Eg3_Star_Box {

	public static void main(String[] args) 
	{
		
//		*****       //rows =3
//		*****       //Columns(*)=5
//		*****
		
//		R=3 C=5 Always Start with Rows - (Outer Loop)
				
     // outer loop for rows (rows count) , here rows are =3
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)  // inner loop for columns (columns count) , here columns are =5
			{
				System.out.print("*");   //Note : use only (print) 
			}
			System.out.println();  //on next line use sprintln 
		}

	}

}
