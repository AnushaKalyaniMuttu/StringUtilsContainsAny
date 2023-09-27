import org.apache.commons.lang3.StringUtils;

public class StringUtilsContainsAny {
    public static void main(String[] args) {
        String text = "This is a sample text.";

        // Check if the text contains any of the specified substrings
        boolean containsText = StringUtils.containsAny(text, "sample", "example");

        if (containsText) {
            System.out.println("The text contains one of the specified substrings.");
        } else {
            System.out.println("The text does not contain any of the specified substrings.");
        }
    }
}
