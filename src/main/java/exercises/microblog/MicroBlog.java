package exercises.microblog;

public class MicroBlog {

    public String truncate(String input) {
        if (input == null) {
            return null;
        }

        int codepointCount = input.codePointCount(0, input.length());
        if (codepointCount < 5) {
            return input;
        }

        int endIndex = input.offsetByCodePoints(0, 5);
        return input.substring(0, endIndex);
    }
}
