package Assignment2;

import java.util.Scanner;

public class Primenumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int a = sc.nextInt();	
		int b=a/2;
		if(b%2==0) {
			System.out.println("Number " + a + " is not a prime number");
		}
			else {
			System.out.println("Number " + a + " is a prime number");
		}
	}
}
