package logicalPrograms;

import java.util.Scanner;

public class ResverseString {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter String to be reversed");
//		String a = sc.next();             
		
		String a ="subodh";                           // my 4 way
		String b = "";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b= b+a.charAt(i);
		}
		
		System.out.println("Original String is "+a);
		System.out.println("Reverse String is "+b);

		
		
		
   System.out.println("************************************************************************");
   
   String str = "subodh";
   
   StringBuffer sb = new StringBuffer(str);
   StringBuffer rev = sb.reverse();
   System.out.println("by buffer reverse string is "+rev);
   

   StringBuilder sb1 = new StringBuilder(str);
   sb1.reverse();
   System.out.println("by builder "+ sb1);
   
	}

}
