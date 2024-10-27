package array;

public class Split {

	public static void main(String[] args) 
	{
		// I LOVE MY INDIA
		
		String My= "I_LOVE_MY_INDIA";
		
		String our[]=My.split("_");
		
		for (int i=0;i<=our.length-1;i++)
		{
			System.out.println(our[i]);
		}
		
		System.out.println("===================================");
		
        String S= "I@HATE@THEIR@PAKISTAN";
		
		String A[]=S.split("@");
		
		for (int i=0;i<=A.length-1;i++)
		{
			System.out.println(A[i]);
		}
		System.out.println("===================================");
		
		
		String x="THIS_IS_MY_COUNTRY";
		
		String y[]=x.split("_");
		
		for (int j=0; j<=y.length-1;j++ ) 
		{
			System.out.println(y[j]);
		}
		System.out.println("======================================");
		
		
		
		

	}

}
