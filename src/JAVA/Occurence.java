package JAVA;

import java.util.Map;
import java.util.TreeMap;

public class Occurence {
	public static void main(String[] args) {

		String name = "My Name is chetan";

		String value = name.replace(" ", "");
		char[] str = value.toCharArray();
		Map<Character, Integer> map = new TreeMap<>();
		int count = 0;

		for (int i = 0; i < str.length; i++) {
			count = 0;
			for (int j = 0; j < str.length; j++) {
				if (str[i] == str[j]) {
					count++;
				}

			}
			map.put(str[i], count);

//			if(count>1) {
//				map.put(str[i], count)
//			}
		}

		System.out.println(map);

	}

}
