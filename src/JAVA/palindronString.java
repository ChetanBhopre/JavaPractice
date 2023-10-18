package JAVA;

public class palindronString {

	public static void main(String[] args) {

		String value = "MADAM";
		
		String rev="";
		
		for(int i=value.length()-1;i>=0;i--) {
			rev=rev+value.charAt(i);
		}
		
		if(rev.equals(value)) {
			System.out.println(value+" is palindrom");
		}
		
		
		

	}

}
