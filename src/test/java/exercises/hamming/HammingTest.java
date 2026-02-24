package exercises.hamming;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HammingTest {

    @DisplayName("Empty strands")
    @Test
    public void shouldReturnNoDistanceBetweenEmptyStrands() {
        Hamming hamming = new Hamming("", "");
        assertEquals(0, hamming.getHammingDistance());
    }

    @DisplayName("Single letter, identical strands")
    @Test
    public void shouldReturnNoDistanceBetweenShortIdenticalStrands() {
        Hamming hamming = new Hamming("A", "A");
        assertEquals(0, hamming.getHammingDistance());
    }

    @DisplayName("Single letter, different strands")
    @Test
    public void shouldReturnCompleteDistanceBetweenShortDifferentStrands() {
        Hamming hamming = new Hamming("G", "T");
        assertEquals(1, hamming.getHammingDistance());
    }

    @DisplayName("Long identical strands")
    @Test
    public void shouldReturnNoDistanceBetweenLongIdenticalStrands() {
        Hamming hamming = new Hamming("GGACTGAAATCTG", "GGACTGAAATCTG");
        assertEquals(0, hamming.getHammingDistance());
    }

    @DisplayName("Long different strands")
    @Test
    public void shouldReturnCompleteDistanceBetweenLongDifferentStrands() {
        Hamming hamming = new Hamming("GGACGGATTCTG", "AGGACGGATTCT");
        assertEquals(9, hamming.getHammingDistance());
    }

    @DisplayName("Disallow left strand longer")
    @Test
    public void validatesLeftStrandMustNotBeLonger() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Hamming("AATG", "AAA"));
        assertEquals("strands must be of equal length", e.getMessage());
    }

    @DisplayName("Disallow right strand longer")
    @Test
    public void validatesRightStrandMustNotBeLonger() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Hamming("ATA", "AGTG"));
        assertEquals("strands must be of equal length", e.getMessage());
    }

    @DisplayName("Disallow empty left strand")
    @Test
    public void validatesLeftStrandMustNotBeEmpty() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Hamming("", "G"));
        assertEquals("strands must be of equal length", e.getMessage());
    }

    @DisplayName("Disallow empty right strand")
    @Test
    public void validatesRightStrandMustNotBeEmpty() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Hamming("G", ""));
        assertEquals("strands must be of equal length", e.getMessage());
    }
}
