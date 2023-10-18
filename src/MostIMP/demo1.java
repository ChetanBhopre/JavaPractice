package MostIMP;

import java.util.LinkedHashMap;



public class demo1 {

	public static void main(String[] args) {
		String a = "selenium testing cucumber";
		char[] b = a.toCharArray();

		LinkedHashMap<Character, Integer> hs = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < b.length; i++) {

			if (hs.containsKey(b[i])) {
				hs.put(b[i], hs.get(b[i]) + 1);
			} else {
				hs.put(b[i], 1);
			}
		}

		for (java.util.Map.Entry<Character, Integer> c : hs.entrySet()) {

			if (c.getValue() > 1) {

				if (c.getKey() == 'a' || c.getKey() == 'e' || c.getKey() == 'i' || c.getKey() == 'o'
						|| c.getKey() == 'u') {
					
					System.out.println("Vowels in String is "+c.getKey()+ "  "+c.getValue());
				}
				else 
				{
					System.out.println("Constants in String is "+c.getKey()+" "+c.getValue());
				}
			}

		}

	}

}
