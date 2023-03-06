package Assignment1;

import java.util.HashMap;
import java.util.Map;

public class duplicatechar {
	public static void main(String[] args) { 
		String str="Hello mummy";
		Map<Character,Integer> Dchar=new HashMap<>();
	
				char chararr[]  = str.toCharArray();
		for(char s:chararr) {
			
			if(Character.isAlphabetic(s)) {
				if(Dchar.containsKey(s)) {
					Dchar.put(s, Dchar.get(s)+1);
					
				}
				else
				{
					Dchar.put(s,1);
				}
			}
		}
		for(char s:Dchar.keySet()) {
			System.out.println(s+" - "+Dchar.get(s));
			
		}
			
	}
}
