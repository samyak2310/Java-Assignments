package Assignment2;

public class Specialchar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Hello$";
		System.out.println(s);
		int j=0;
		for (int i=0;i<s.length();i++) {
			if(!Character.isAlphabetic(s.charAt(i))&&!Character.isDigit(s.charAt(i))&&!Character.isWhitespace(s.charAt(i))) {
					j++;
				//System.out.println(j); 
				break;
				}				
			}
		if(j>0) {
			System.out.println("The string contains a Special character");
			//System.out.println(j); 
	}
		else 
		{
			System.out.println("The string does not contain Special charaters");
		}
}

}