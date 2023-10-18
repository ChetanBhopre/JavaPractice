package MostIMP;

import java.util.LinkedHashSet;

public class count_vowels_in_string {

	public static void main(String[] args) {
		
		String name= "Selenium with java";
		
		char [] a = name.toCharArray();
		int count=0;
		LinkedHashSet set =new LinkedHashSet();
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
				set.add(a[i]);
			}
		}
		System.out.println(set);
		

	}

}
