package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    // String to be scanned to find the pattern.
    private String line = "This order was placed for QT3000! OK?";
    private String pattern = "(.*)(\\d+)(.*)";

    // Create a pattern object
    private Pattern p = Pattern.compile(pattern);

    // Create a matcher object
    private Matcher m = p.matcher(line);

    public RegexMatches() {
    }

    public void display() {
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }
    }
}
