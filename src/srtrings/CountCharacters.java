package srtrings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacters {

	public static void main(String[] args) {

		String str = "LavanyaLy";
		
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		
		for (char ch : str.toCharArray()) {
			
			if(!m.containsKey(ch))
			{
				m.put(ch, 1);
			}
			else
			{
				int oldvalue = m.get(ch);
				int newvalue = oldvalue+1;
				m.put(ch, newvalue);
			}			
		}
		System.out.println(m);
	}

}
