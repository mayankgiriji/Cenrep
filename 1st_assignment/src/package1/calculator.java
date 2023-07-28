package package1;

public class calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract (int a, int b) {
		return a-b;
	}
	public int multiply (int a ,int b) {
		return a*b;
	}
	public int devide (int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		int a=10;
		int b=2;
			calculator cal=new calculator ();
			int result1=cal.add(a, b);
			int result2=cal.add(result1, b);
			int result3=cal.subtract(result2,b);
			int result4=cal.multiply(result3, b);
			int result5=cal.devide(result4,b);
			
			System.out.println("((((10+2)-2)*2)/2)="+""+result5);
		
	}
}
