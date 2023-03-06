package Assignment1;

public class reverseword {
	public static void main(String[] args) { 
	String s = "Samyak" ;
	String s1=" ";
			int i= s.length()-1;
					while(i>0) {
						for(i=s.length()-1;i>=0;i--) {
					s1=s1+s.charAt(i);
					
				}
						System.out.println(s1);
			}
			
			
	}
}

