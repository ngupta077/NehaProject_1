package pkg1;

public class swapnumbers {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c;
        System.out.println(" value of a "  + a);
		System.out.println(" value of b"  + b);
		
		c=b;    //c=20
		b=a;	//b=10
		a=c;    //a=20
		System.out.println("value of a after swap is"  +  a );
		System.out.println("value of b after swap is"  +  b );	

	}

}
