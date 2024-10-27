package Pattern_Programming;

import java.util.Iterator;

public class Eg12_DescAsce_Dec_Inc {

	public static void main(String[] args) 
	{
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****

		
//		Step1: count no of ==>> R=9 C=5 
		
//		Always Start with Rows - (Outer Loop)
		
		int star=5;   //on the first row there is star, star=7
		
		for(int i=1;i<=9;i++)  // outer loop for row, no of rows =4
		{
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");   //Note : use only (print) 
			}
			System.out.println();  //on next line use sprintln 
			//star--;
			if(i<5)          //or (i<=4)       //for descending order
			{
				star--;                        //for ascending order
			}
			else
			{
				star++;
			}
			
		}
	}
}
