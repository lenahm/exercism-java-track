package exercises.pangram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PangramCheckerTest {

    private PangramChecker pangramChecker;

    @BeforeEach
    public void setUp() {
        pangramChecker = new PangramChecker();
    }

    @Test
    @DisplayName("No Pangram: Empty sentence")
    public void emptySentenceIsNotPangram() {
        assertFalse(pangramChecker.isPangram(""));
    }

    @Test
    @DisplayName("Pangram: All letters in the alphabet")
    public void allLettersInAlphabetIsPangram() {
        assertTrue(pangramChecker.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    @DisplayName("Pangram: Only lower case")
    public void phraseWithOnlyLowerCaseIsPangram() {
        assertTrue(pangramChecker.isPangram("the quick brown fox jumps over the lazy dog"));
    }

    @Test
    @DisplayName("No Pangram: Missing the letter 'x'")
    public void missingOneLetterIsNotPangram1() {
        assertFalse(pangramChecker.isPangram("a quick movement of the enemy will jeopardize five gunboats"));
    }

    @Test
    @DisplayName("No Pangram: Missing the letter 'h'")
    public void missingOneLetterIsNotPangram2() {
        assertFalse(pangramChecker.isPangram("five boxing wizards jump quickly at it"));
    }

    @Test
    @DisplayName("Pangram: Lower case with underscores")
    public void phraseWithLowerCaseAndUnderscoresIsPangram() {
        assertTrue(pangramChecker.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

    @Test
    @DisplayName("Pangram: Lower case with numbers")
    public void phraseWithLowerCaseAndNumbersIsPangram() {
        assertTrue(pangramChecker.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }

    @Test
    @DisplayName("No Pangram: Missing letters replaced by numbers")
    public void missingLettersReplacedByNumbersIsNotPangram() {
        assertFalse(pangramChecker.isPangram("7h3 qu1ck brown fox jumps ov3r 7h3 lazy dog"));
    }

    @Test
    @DisplayName("Pangram: Mixed case and punctuation")
    public void phraseWithMixedCaseAndPunctuationIsPangram() {
        assertTrue(pangramChecker.isPangram("\"Five quacking Zephyrs jolt my wax bed.\""));
    }
}
