package Assignment2;

import java.util.Scanner;

public class Removechar {
	public static void main(String[] args) {
		String s= "hi good morning";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter i :");
		int b = sc.nextInt();
		System.out.println(removeChar(s,b));
	}
		public static String removeChar(String s, int n) {
			   return s.substring(0, n-1) + s.substring(n);
			}
		
}
	

