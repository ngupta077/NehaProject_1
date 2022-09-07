package pkg1;

public class Assignment3 
{
	//find value of ((((10*2)-2)+2)-2)/2)
	
	public int multi(int x1,int y1)
	{
		int z1 = x1*y1;
		return z1;
	}
	public int sub(int x2,int y2)
	{
		int z2 = x2-y2;
		return z2;
	}
	public int add(int x3,int y3)
	{
		int z3 = x3+y3;
		return z3;
	}
	public int div(int x4,int y4)
	{

		int z4 = x4/y4;
		return z4;
	}

	public static void main(String[] args) 
	{
		Assignment3 obj1 = new Assignment3();
				int res1= obj1.multi(10,2);
				int res2= obj1.sub(res1,2);
				int res3= obj1.add(res2,2);
				int res4= obj1.sub(res3,2);
				int res5= obj1.div(res4,2);
				System.out.println("result of ((((10*2)-2)+2)-2)/2)  is" + " " + res5);

	}

}
