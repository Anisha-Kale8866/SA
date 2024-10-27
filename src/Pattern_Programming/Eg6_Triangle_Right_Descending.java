package Pattern_Programming;

import java.util.Iterator;

public class Eg6_Triangle_Right_Descending {

	public static void main(String[] args) 
	{
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
//		Step1: count no of ==>> R=5 C=5 
		
//		Always Start with Rows - (Outer Loop)
		
		int space=0;  //on the first row there is no space, space=0
		int star=5;  
		
		for(int i=1;i<=5;i++)   // outer loop for row, no of rows =5
		{
			for(int j=1;j<=space;j++) // 1st inner loop for : space 
			{
				System.out.print(" ");   //Note : use only (print) 
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");   //Note : use only (print) 
			}
			System.out.println();  //on next line use sprintln 
			star--;
			space++;
		}
	}
}
