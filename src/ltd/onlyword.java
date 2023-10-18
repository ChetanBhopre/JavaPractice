package ltd;

public class onlyword {

	public static void main(String[] args) {
		// Write java program to print only words from given string "sulbha45245@#₹₹"

		String str = "chetan123@@##";
		printSpecialCharacters(str);
		
	}
	 public static void printSpecialCharacters(String word) {
		for (int i = 0; i < word.length(); i++) {
			char[] a = word.toCharArray();
			if (Character.isLetter(a[i])) {
				System.out.println(a[i]);
			}
		//	System.out.println("");
			if (Character.isDigit(a[i])) {
				System.out.println(a[i]);
			}
		//	System.out.println("");
			if(!Character.isLetterOrDigit(a[i])) {
				System.out.println(a[i]);
			}

		}
	}

}
