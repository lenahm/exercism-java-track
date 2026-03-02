package exercises.pangram;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        Set<Character> letters = new HashSet<>();
        input = input.toLowerCase();

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }
        return letters.size() == 26;
    }
}
