package pkg1;

/*output: using this keyword and create one object 
three parametrized constructor
default construtor
two para
four para
one parametrized constructor */

public class Assignment5 
{
	public Assignment5()
	{
		this(1,1,1);
	  System.out.println("default constructor");
	}
	
	public Assignment5(int a)
	{ 
		this(10,20,30,40);
		 System.out.println("one parametrized constructor");
	}
	
	public Assignment5(int a, int b)
	{
		this();
		 System.out.println("two parametrized constructor");
	}
	
	public Assignment5(int a, int b, int c)
	{ 
		
		 System.out.println("three parametrized constructor");
	}
	
	public Assignment5(int a, int b, int c, int d)
	{
		this(10,0);
		 System.out.println("four parametrized constructor");
	}
	
	
	public static void main(String[] args)
	{
		
		Assignment5 ob = new Assignment5(10);
	}

}
