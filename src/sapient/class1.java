package sapient;

import java.util.Map;
import java.util.TreeMap;

public class class1 {
	/*
	 * String str = "KreETI KrUPAl GanDHI InTERvieW"; Output should be String str =
	 * "Kre@t@ @@upal G@ndh@ InTERvieW";(means repeating character should be replace
	 * by @
	 * 
	 */
	public static void main(String[] args) {

		String str = "KreETI KrUPAl GanDHI InTERvieW";

		String value = str.replace(" ", "").toLowerCase();
		int count = 0;

		Map<Character, Integer> map = new TreeMap<>();

		char[] word = value.toCharArray();

		for (int i = 0; i < word.length; i++) {
			count=0;
			for (int j = 0; j < word.length; j++) {
				if (word[i]==word[j]) {
					count++;
				}
				map.put(word[i], count);
			}
			
		}
		System.out.println(map);

	}

}
