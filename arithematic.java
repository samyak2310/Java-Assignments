package Assignment1;

public class arithematic {
	public static void main(String[] args) {
		int x=20,y = 10;
		int z,z1;
		z=add(x,y);
		z1=divide(x,y);
		System.out.println("Sum of two numbers is :"+z);
		System.out.println("Quotient is:"+z1);
	}
	public static int add(int a,int b) {
		int sum = a+b;
		return sum;		
	}
	public static int divide(int a,int b) {
		int divide = a/b;
		return divide;		
	}
}
