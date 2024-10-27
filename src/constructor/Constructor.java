package constructor;

public class Constructor {        //class name
int a;                            //Global
int b;                            //Global

public Constructor()             //without parameter
{
	a=10;
	b=20;
}
public Constructor(int x,int y)  // with 2 parameter
{
	a=x;
	b=y;
}

public Constructor(int m)        // with 1 parameter
{
 a=m;
 }


public static void main(String[] args) 
	{
 Constructor subodh2=new Constructor(60, 40); // calling with 2 parameter 
 subodh2.addition();
 
 Constructor subodh=new Constructor();  //calling without parameter
 subodh.addition();

 Constructor Subodh1=new Constructor(200); //calling with 1 parameter
 Subodh1.addition();
 
	}



public void addition()
{
	System.out.println("addition is "+(a+b));
}


}