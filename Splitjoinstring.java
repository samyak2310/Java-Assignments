package Assignment2;

public class Splitjoinstring {
	public static void main(String[] args) {
		System.out.println("Splitting");
		System.out.println("---------");
		String s= "Java Assignment";
		String word[]=s.split(" ");
		for (int i=0;i<word.length;i++) {
		System.out.println(word[i]);
			}
		System.out.println("Joining");
		System.out.println("--------");
		String str=String.join(" ","java","string"," assignment");
		System.out.println(" After Joining:" +str);
}}
