package package1;

public class student {
	
	int age;
	int roll_no;
	public void display1()
	{
		System.out.println("Welcome to all of you ");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}		
	
	public static void main(String[] args) {
		{
		student ab=new student();
		ab.display1();
        ab.display2();
        ab.age=25;
        ab.roll_no=25;
        System.out.println("Age of student is "+ab.age);
        System.out.println("roll no of student is "+ab.roll_no);
	}}}
	



