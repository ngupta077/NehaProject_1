package pkg1;

public class Student //class creation
{
	int age, rollno; // declare variable 
   public void display1()  // first method creation
   {
	  
	 System.out.println("Welcome to all of you");
   }
   public void display2()  // second method creation
   {
	  
	 System.out.println("Automation is very easy");
   }
   public static void main(String[] args) //main method start p[oint of execution
   {
	Student obj1=new Student(); //object creation
	obj1.age=25;
	obj1.rollno=1001;
	//int pro=obj1.a=100; // call variable 
	System.out.println("age of student is "+ obj1.age);
	System.out.println("rollno of student is" + " " + obj1.rollno);
	obj1.display1();
	obj1.display2();
	
   }
	
}




