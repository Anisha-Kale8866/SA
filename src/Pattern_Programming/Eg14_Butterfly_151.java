package Pattern_Programming;

import java.util.Iterator;

public class Eg14_Butterfly_151 {

	public static void main(String[] args) 
	{

//		*
//		**
//		***
//		****
//		***
//		**
//		*

		
//		Step1: count no of ==>> R=9 C=5 
		
//		Always Start with Rows - (Outer Loop)
		
		int star=1;   //on the first row there is star, star=5
		
		for(int i=1;i<=7;i++)  // outer loop for row, no of rows =7
		{
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");   //Note : use only (print) 
			}
			System.out.println();  //on next line use sprintln 
			//star++;
			if(i<4)          //or (i<=3)       //for descending order
			{
				star++;                        //for ascending order
			}
			else
			{
				star--;
			}
			
		}
	}
}
