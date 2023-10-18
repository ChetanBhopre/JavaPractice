package MostIMP;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Remove_duplicate_character {
	// pls notes are delow

	public static void main(String[] args) {

		String input = "Selenium With Java";
		String unique_Char = removeDuplicate(input);
		System.out.println(unique_Char.replace(" ", ""));

		// word
		String word = "Nagpur is the third-largest city of the Indian state of Maharashtra after Mumbai and Pune.[15] Known as the \"Orange City\", Nagpur is the 13th largest city in India by population and according to an Oxford's Economics report, Nagpur is projected to be the fifth fastest growing city in the world from 2019 to 2035 with an average growth of 8.41%.[16] It has been proposed as one of the Smart Cities in Maharashtra and is one of the top ten cities in India in Smart City Project execution.";

		String[] splitword = word.split(" ");
		
		String unique_word =remove_Duplicate_word(splitword);
		
		System.out.println(unique_word);
	}

	public static String removeDuplicate(String value) {

		char[] input = value.toCharArray();

		LinkedHashSet hs = new LinkedHashSet();

		for (int i = 0; i < input.length; i++) {
			hs.add(input[i]);
		}
		return hs.toString();
	}

	public  static String remove_Duplicate_word(String [] name) {
		
		LinkedHashSet ls = new LinkedHashSet();
		
		for(int i=0;i<name.length;i++) {
			ls.add(name[i]);
		}

		return ls.toString();
	}

	void notes() {
		String a = "java";

		// step 1: convert string into char [] array

		char[] b = a.toCharArray();

		// step 2: create object of LinkedHashSet so we can add one by one value in
		// hashSet
		LinkedHashSet hs = new LinkedHashSet();

		// step 3: iterate the all array value inside or add value into linkedHashSet

		for (int i = 0; i < b.length; i++) {

			hs.add(b[i]);
		}
		// step 4: print linkedList
		System.out.println(hs);

	}

}
