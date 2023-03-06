package Assignment1;

public class hprint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "hi good morning, how are you, We are here to celibrate holi, plz come home";

		//System.out.println(s.charAt());
		
		String word[]=s.split(" ");
	
		for (int i=0;i<word.length;i++) {
					if(word[i].startsWith("h")==true) {
						System.out.println(word[i]); 
					}
		
			
			
			}
		}
	}

