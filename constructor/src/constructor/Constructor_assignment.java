package constructor;

public class Constructor_assignment {

	public Constructor_assignment()
	{
		this (1,2,3);
		System.out.println("Default constructor");
}
	public Constructor_assignment(int a )

	{
		this (1,2,3,4);
		System.out.println("one perameterized");
	}

	public Constructor_assignment(int a,int b)
	{
	    this ();
		System.out.println("Two perameterized constructor ");
	}
	
	public Constructor_assignment(int a,int b,int c)
	{
		this (1,2);
		System.out.println("three perematrized constructor ");
	}
	
	public Constructor_assignment(int a,int b,int c,int d)
	{
	System.out.println("Four perameterized constructor");
	}

	public static void main(String[] args) 
	{
		
		Constructor_assignment obj=new Constructor_assignment(12);
	}
	

		