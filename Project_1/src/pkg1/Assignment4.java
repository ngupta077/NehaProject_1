package pkg1;

/*output: using this keyword and create one object 
three parametrized constructor
default construtor
one para
two para
four parametrized constructor */


public class Assignment4 
{ 
	public Assignment4()
	{
		this(10,20,30);
	  System.out.println("default constructor");
	}
	
	public Assignment4(int a)
	{
		this();
	  System.out.println("one parametrized constructor");
	}
	
	public Assignment4(int a , int b)
	{
		this(10);
	  System.out.println("two parametrized constructor");
	}
	
	public Assignment4(int a, int b , int c)
	{
	  
	  System.out.println("three parametrized constructor");
	}
	
	public Assignment4(int a , int b, int c, int d)
	{
		this(10,20);
	  System.out.println("four parametrized constructor");
	}
	
    
   public static void main(String[] args) 
   {
	   Assignment4 ob= new Assignment4(10,20,30,40);
	   
}
}
