package exercises.perfectnumbers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NaturalNumberTest {

    @DisplayName("6 is a perfect number")
    @Test
    public void shouldClassifyTheSmallestPerfectNumberCorrectly() {
        assertEquals(Classification.PERFECT, new NaturalNumber(6).getClassification());
    }

    @DisplayName("28 is a perfect number")
    @Test
    public void shouldClassifyMediumPerfectNumberCorrectly() {
        assertEquals(Classification.PERFECT, new NaturalNumber(28).getClassification());
    }

    @DisplayName("33550336 is a perfect number")
    @Test
    public void shouldClassifyLargePerfectNumberCorrectly() {
        assertEquals(Classification.PERFECT, new NaturalNumber(33550336).getClassification());
    }

    @DisplayName("12 is an abundant number")
    @Test
    public void shouldClassifyTheSmallestAbundantNumberCorrectly() {
        assertEquals(Classification.ABUNDANT, new NaturalNumber(12).getClassification());
    }

    @DisplayName("30 is an abundant number")
    @Test
    public void shouldClassifyMediumAbundantNumberCorrectly() {
        assertEquals(Classification.ABUNDANT, new NaturalNumber(30).getClassification());
    }

    @DisplayName("33550335 is an abundant number")
    @Test
    public void shouldClassifyLargeAbundantNumberCorrectly() {
        assertEquals(Classification.ABUNDANT, new NaturalNumber(33550335).getClassification());
    }

    @DisplayName("2 is a deficient number")
    @Test
    public void shouldClassifyTheSmallestDeficientNumberCorrectly() {
        assertEquals(Classification.DEFICIENT, new NaturalNumber(2).getClassification());
    }

    @DisplayName("4 is a deficient number")
    @Test
    public void shouldClassifySmallDeficientNumberCorrectly() {
        assertEquals(Classification.DEFICIENT, new NaturalNumber(4).getClassification());
    }

    @DisplayName("32 is a deficient number")
    @Test
    public void shouldClassifyMediumDeficientNumberCorrectly() {
        assertEquals(Classification.DEFICIENT, new NaturalNumber(32).getClassification());
    }

    @DisplayName("33550337 is a deficient number")
    @Test
    public void shouldClassifyLargeDeficientNumberCorrectly() {
        assertEquals(Classification.DEFICIENT, new NaturalNumber(33550337).getClassification());
    }

    @DisplayName("Edge Case: 1 is a deficient number")
    @Test
    public void shouldClassifyNumber1AsDeficientNumber() {
        assertEquals(Classification.DEFICIENT, new NaturalNumber(1).getClassification());
    }

    @DisplayName("Zero is rejected (not a positive integer")
    @Test
    public void shouldRejectZero() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new  NaturalNumber(0));
        assertEquals("You must supply a natural number (positive integer)", e.getMessage());
    }

    @DisplayName("Negative integer is rejected (not a positive integer)")
    @Test
    public void shouldRejectNegativeInteger() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new  NaturalNumber(-1));
        assertEquals("You must supply a natural number (positive integer)", e.getMessage());
    }
}
