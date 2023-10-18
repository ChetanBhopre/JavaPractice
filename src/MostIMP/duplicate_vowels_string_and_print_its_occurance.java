package MostIMP;

import java.util.HashMap;

public class duplicate_vowels_string_and_print_its_occurance {

	public static void main(String[] args) {
		String name= "Selenium with java";
		char [] a = name.toCharArray();
		int count=0;
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
					hm.put(a[i], count);
				}
			}
		}
		System.out.println(hm);

	}

}
