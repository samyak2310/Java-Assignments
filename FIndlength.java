package Assignment2;

public class FIndlength {
	public static void main(String[] args) { 
		String str[] = {"Apple", "bananana", "kiwi", "berry","almond"};
		//System.out.println(str.length);
		int k=5;
		for(int i=0;i<=str.length-1;i++) {
			if(str[i].length()>k) {
				System.out.println("Word having length more than k is:");
				System.out.println(str[i]);
			}
		}
}
}