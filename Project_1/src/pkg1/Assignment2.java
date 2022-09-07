package pkg1;

// Find the result of  ((((10+2)+2)*2)-2)/2)

public class Assignment2 
{
	public int sum (int a1, int b1)
	{
		int c1= a1+b1;
		return(c1);
		
	}
	public int multi (int a2, int b2)
	{
		int c2= a2*b2;
		return(c2);
	}
	public int sub (int a3 , int b3)
	{
		int c3= a3-b3;
		return(c3);
	}
	public int div (int a4, int b4)
	{
		int c4= a4/b4;
		return(c4);
	}

	public static void main(String[] args) 
	{
		Assignment2 obj1 = new Assignment2();
		int rest1=  obj1.sum  (10,2);
		int rest2 = obj1.sum  (rest1,2);
		int rest3 = obj1.multi(rest2,2);
		int rest4 = obj1.sub  (rest3,2);
		int rest5 = obj1.div  (rest4,2);
		
		System.out.println( "value of ((((10+2)+2)*2)-2)/2)" + " = " + rest5 );

	}

}
