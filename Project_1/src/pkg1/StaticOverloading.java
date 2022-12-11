//Rules: Polymorphism
	//1. method name = same
	//2. method input data type = always different
	//3. method output i.e return type of method(int,void) can or can't be same.

package pkg1;

public class StaticOverloading
{
	//public void m1(int a, int b)
	//{
		//System.out.println("first method");
	//}
	public void m1(float a, int b)
	{
		System.out.println("second method");
	}
	public void m1(float a, float b)
	{
		System.out.println("third method");
	}
	public void m1(int a, int b, int c)
	{
		System.out.println("forth method");
	}
	public int m1(int a, int b)
	{
		System.out.println("fifth method");
		int z=a+b;
		System.out.println(z);
		return z;
	}

	public static void main(String[] args) 
	{
		StaticOverloading obj = new StaticOverloading();
		int res= obj.m1(10,20);
		System.out.println(res);
		

	}

}
