package MostIMP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class Remove_duplicate_char_fr_string_and_print_occurance_repeate_onlyOne_Time {

	public static void main(String[] args) {

		String duplicates = "aaaabbbbaaabcdddddccddefgh";
		String unique = remove_Duplicate(duplicates);

		System.out.println(unique);

		// word

		String[] a = "java java java selenium java cucumber selenium java".split(" ");

		String unique_word =remove_Duplicate_word(a);
		
		System.out.println(unique_word);

	}

	public static String remove_Duplicate(String input) {
		char[] word = input.toCharArray();
		
		LinkedHashSet<Character> ls = new LinkedHashSet<Character>();
		
		for(int i=0;i<word.length;i++) {
			ls.add(word[i]);
		}
		return ls.toString();

/*		HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;

		for (int i = 0; i < word.length; i++) {
			count = 0;
			for (int j = 0; j < word.length; j++) {
				if (word[i] == word[j]) {
					count++;
				}
				if (count == 1) {
					map.put(word[i], count);
				}
			}
		}
		
		return map.toString();
*/
	}

	public static String remove_Duplicate_word(String[] input) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int count = 0;

		for (int i = 0; i < input.length; i++) {
		//	count = 0;
			for (int j = 0; j < input.length; j++) {
				if (input[i] == input[j]) {
					count++;
				}			
				map.put(input[i], count);			
			}
			
			
		}
		return map.toString();

	}

	void notes() {

		String a = "java";

		// step 1: convert string into char [] array
		char[] b = a.toCharArray();

		// step 2: create object of HashMap beacuse HashMap does not allowed duplicate
		// keys
		LinkedHashMap<Character, Integer> hs = new LinkedHashMap<Character, Integer>();

		// step 3: iterator char array and add value inside the HashMap or LinkedHashMap

		for (int i = 0; i < b.length; i++) {
			hs.put(b[i], 1);
		}

		// step 4: print LinkedHashMap key-value pair

		System.out.println(hs);

		// or

		for (Entry<Character, Integer> c : hs.entrySet()) {
			System.out.println(c.getKey() + " " + c.getValue());
		}

	}
}
