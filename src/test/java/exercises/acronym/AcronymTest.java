package exercises.acronym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcronymTest {

    @DisplayName("Acronym for 'Portable Network Graphics'")
    @Test
    public void shouldReturnCorrectAcronymPNG() {
        assertEquals("PNG", new Acronym("Portable Network Graphics").get());
    }

    @DisplayName("Acronym with lowercase input")
    @Test
    public void shouldReturnCorrectAcronymWithLowercaseInput() {
        assertEquals("ROR", new Acronym("Ruby on Rails").get());
    }

    @DisplayName("Acronym with punctuation input")
    @Test
    public void shouldReturnCorrectAcronymWithPunctuationInput() {
        assertEquals("FIFO", new Acronym("First In, First Out").get());
    }

    @DisplayName("Acronym with uppercase input")
    @Test
    public void shouldReturnCorrectAcronymWithUppercaseInput() {
        assertEquals("GIMP", new Acronym("GNU Image Manipulation Program").get());
    }

    @DisplayName("Acronym with hyphens input")
    @Test
    public void shouldReturnCorrectAcronymWithHyphensInput() {
        assertEquals("CMOS", new Acronym("Complementary metal-oxide semiconductor").get());
    }

    @DisplayName("Acronym with consecutive delimiters input")
    @Test
    public void shouldReturnCorrectAcronymWithConsecutiveDelimitersInput() {
        assertEquals("SIMUFTA", new Acronym("Something - I made up from thin air").get());
    }

    @DisplayName("Acronym with apostrophes input")
    @Test
    public void shouldReturnCorrectAcronymWithApostrophesInput() {
        assertEquals("HC", new Acronym("Halley's Comet").get());
    }

    @DisplayName("Acronym with underscores input")
    @Test
    public void shouldReturnCorrectAcronymWithUnderscoresInput() {
        assertEquals("TRNT", new Acronym("The Road _Not_ Taken").get());
    }

    @DisplayName("Very long acronym")
    @Test
    public void shouldReturnCorrectAcronymVeryLong() {
        assertEquals("ROTFLSHTMDCOALM", new Acronym("Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me").get());
    }
}
