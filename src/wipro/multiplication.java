package wipro;

public class multiplication {

	//public class MultiplyIntAndString {
	    public static void main(String[] args) {
	        int intValue = 4;
	        String stringValue = "two";

	        try {
	            int numericValue = Integer.parseInt(stringValue);
	            int result = intValue * numericValue;
	            System.out.println("Result: " + result);
	        } catch (NumberFormatException e) {
	            System.out.println("Failed to parse the string as an integer.");
	        }
	    }
	}

