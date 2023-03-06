package Assignment2;

public class EvenNum {
	public static void main(String[] args) {
		int i;
		System.out.println("Even Numbers from 2000-4000 are:");
		for (i=2000;i<=4000;i++) {
			if (i%2==0) {
				System.out.println(+i);
			}
		}
	}
}
