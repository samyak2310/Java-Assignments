package Assignment1;
 
public class Swapping {
	public static void main(String[] args)
	{
		int x= 10;int y=20;
		System.out.println("x Value before swapping are :" +x);
		System.out.println("y Value before swapping are :" +y);
		System.out.println("-------------------------------");
		x= x+y;
		y= x-y;
		x= x-y;
		System.out.println("x Value after swapping are :" +x);
		System.out.println("y Value after swapping are :" +y);	
		
	
	}
	

}
