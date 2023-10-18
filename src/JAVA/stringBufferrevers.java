package JAVA;

import java.util.Scanner;

public class stringBufferrevers {

	public static void main(String[] args) {
		
		String firstWord = "My name is khna"; //yM eman si anhk 
		String[] words = firstWord.split(" ");

		StringBuffer rever = new StringBuffer();

		for (String word : words) {
			StringBuffer reverseString = new StringBuffer(word);
			reverseString.reverse();
			rever.append(reverseString).append(" ");

		}
		System.out.println(rever.toString().trim());

	}
	

//
//		public static void revers(String abc) {
//
//			// String firstWord = "My name is khna"; //yM eman si anhk
//
//			String[] words = abc.split(" ");
//
//			StringBuffer reverse = new StringBuffer();
//
//			for (String word : words) {
//				StringBuffer reverseString = new StringBuffer(word);
//				reverseString.reverse();
//				reverse.append(reverseString).append(" ");
//
//			}
//			System.out.println(reverse.toString().trim());
//
//		}
//
//		public static void main(String[] args) {
//			String abc = "My name is khna";
//			
//			revers(abc);
//
//		}
//
//	}

	
	

}
