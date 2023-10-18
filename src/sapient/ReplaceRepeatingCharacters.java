package sapient;
public class ReplaceRepeatingCharacters {
    public static void main(String[] args) {
        String str = "KreETI KrUPAl GanDHI InTERvieW";
        String replacedStr = replaceRepeatingWithAt(str);
        System.out.println("Original string: " + str);
        System.out.println("Replaced string: " + replacedStr);
    }

    public static String replaceRepeatingWithAt(String str) {
        StringBuilder result = new StringBuilder();

        char prevChar = '\0';  // Initialize with a null character

        for (char currentChar : str.toCharArray()) {
            if (currentChar == prevChar) {
                result.append('@');
            } else {
                result.append(currentChar);
            }
            prevChar = currentChar;
        }

        return result.toString();
    }
}
