package exercises.rnatranscription;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RnaTranscriptionTest {

    private RnaTranscription rnaTranscription;

    @BeforeEach
    public void setUp() {
        rnaTranscription = new RnaTranscription();
    }

    @Test
    @DisplayName("Empty RNA sequence")
    public void shouldReturnEmptyRnaSequence() {
        assertTrue(rnaTranscription.transcribe("").isEmpty());
    }

    @Test
    @DisplayName("RNA complement of cytosine is guanine")
    public void shouldReturnRnaComplementOfCytosine() {
        assertEquals("G", rnaTranscription.transcribe("C"));
    }

    @Test
    @DisplayName("RNA complement of guanine is cytosine")
    public void shouldReturnRnaComplementOfGuanine() {
        assertEquals("C", rnaTranscription.transcribe("G"));
    }

    @Test
    @DisplayName("RNA complement of thymine is adenine")
    public void shouldReturnRnaComplementOfThymine() {
        assertEquals("A", rnaTranscription.transcribe("T"));
    }

    @Test
    @DisplayName("RNA complement of adenine is uracile")
    public void shouldReturnRnaComplementOfAdenine() {
        assertEquals("U", rnaTranscription.transcribe("A"));
    }

    @Test
    @DisplayName("RNA complement of long DNA strand")
    public void shouldReturnCorrectRnaComplementOfLongDNAStrand() {
        assertEquals("UGCACCAGAAUU", rnaTranscription.transcribe("ACGTGGTCTTAA"));
    }
}
