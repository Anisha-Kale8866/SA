package Pattern_Programming;

import java.util.Iterator;

public class Eg9_Equilateral_Triangal_upword {

	public static void main(String[] args) 
	{
//		   *
//		  ***
//		 *****
//		*******

		
//		Step1: count no of ==>> R=4 C=7 
		
//		Always Start with Rows - (Outer Loop)
		
		int space=3;  //on the first row there is space, space=4
		int star=1;   //on the first row there is star, star=7
		
		for(int i=1;i<=4;i++)  // outer loop for row, no of rows =4
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
			star= star+2;
			space--;
		}
	}
}
