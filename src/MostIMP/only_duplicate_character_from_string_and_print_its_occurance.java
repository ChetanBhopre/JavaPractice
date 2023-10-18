package MostIMP;

import java.util.HashMap;

public class only_duplicate_character_from_string_and_print_its_occurance {

	public static void main(String[] args) {

		String duplicates = "Selenium with java";
		//String duplicates = "Selenium with java".                   replace(" ", "");

		String duplicatewithOcc=duplicate_Characters(duplicates);
		
		System.out.println(duplicatewithOcc);
	}
	
	public static String duplicate_Characters(String input) {
		
		char [] value = input.toCharArray();
		HashMap<Character,Integer> map =new HashMap<Character,Integer>();
		int count =0;
		
		for(int i = 0; i<value.length;i++) {
			count=0;
			for(int j = 0; j<value.length;j++) {
				if(value[i]==value[j]) {
					count++;
				}
				if(count==1) {
					map.put(value[i], count);
				}
			}
		}
		return map.toString();
		
	}
	
}
