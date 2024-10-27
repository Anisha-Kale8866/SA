package Pattern_Programming;

import java.util.Iterator;

public class Eg13_AsceDesc_Inc_Dec {

	public static void main(String[] args) 
	{
		
//		*         *
//		**       **
//		***     ***
//		****   ****
//		***** *****
//		****   ****
//		***     ***
//		**       **
//		*         *

		int star=1;   // star on the first row left
		int space=5;  // space on the first row left
		int star2=1;  // star on the first row right
		int space2=4; // space on the first row right
		
		// (remember : Star space space star)

//		Step1: count no of ==>> R=9 C=5 
		
//		Always Start with Rows - (Outer Loop)
		
		
		for(int i=1;i<=9;i++)  // outer loop for row, no of rows = 9
		{
			
			for(int j=1;j<=star;j++)   //inner loop for star(left)
			{
				System.out.print("*");
			}
			
			for(int k=1;k<=space;k++)   //inner loop for space(left)
			{
				System.out.print(" ");  
			}
			
			for(int l=1;l<=space2;l++)   //inner loop for space2(right)
			{
				System.out.print(" ");
			}
			
			for(int m=1;m<=star2;m++)   //inner loop for star(right)
			{
				System.out.print("*");   
			}
			
			if(i<5)          
			{
				star++;
				space--;
				space2--;
				star2++;
			}
			
			else
			{
				star--;
				space++;
				space2++;
				star2--;
			}
			
			System.out.println();  //on next line use sprintln 
	
		}
	}
}
