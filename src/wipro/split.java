package wipro;

public class split {

	public static void main(String[] args) {
		//print only value under sulbh and pune
		
		String values="My name is 'sulbha' i am from 'pune'";
		
		String[] split = values.split("'");
		
		String first_word = split[1];
		String Second_Word = split[3];
		
		System.out.println(first_word + " " + Second_Word);
		


	}

}
