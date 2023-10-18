package FIS;

public class String_word {

	public static void main(String[] args) {
		
	String name = "My Name is chetan";
	
	String letter = name.replace(" ","");
	int letter_count = 0;
	
	for(int i =0;i<=letter.length()-1;i++) {
		letter_count++;
	}
	System.out.println(letter_count);
	}

}
