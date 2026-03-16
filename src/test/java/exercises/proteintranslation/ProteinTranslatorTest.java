package exercises.proteintranslation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProteinTranslatorTest {

    private ProteinTranslator translator;

    @BeforeEach
    public void setUp() {
        translator = new ProteinTranslator();
    }

    @DisplayName("Empty RNA sequence results in no proteins")
    @Test
    public void testEmptyRnaSequence() {
        assertEquals(Collections.emptyList(), translator.translate(""));
    }

    @DisplayName("Methionine RNA sequence")
    @Test
    public void testMethionineRnaSequence() {
        assertEquals(List.of("Methionine"), translator.translate("AUG"));
    }

    @DisplayName("Phenylalanine RNA sequence 1")
    @Test
    public void testPhenylalanineRnaSequence1() {
        assertEquals(List.of("Phenylalanine"), translator.translate("UUU"));
    }


    @DisplayName("Phenylalanine RNA sequence 2")
    @Test
    public void testPhenylalanineRnaSequence2() {
        assertEquals(List.of("Phenylalanine"), translator.translate("UUC"));
    }

    @DisplayName("Leucine RNA sequence 1")
    @Test
    public void testLeucineRnaSequence1() {
        assertEquals(List.of("Leucine"), translator.translate("UUA"));
    }

    @DisplayName("Leucine RNA sequence 2")
    @Test
    public void testLeucineRnaSequence2() {
        assertEquals(List.of("Leucine"), translator.translate("UUG"));
    }

    @DisplayName("Serine RNA sequence 1")
    @Test
    public void testSerineRnaSequence1() {
        assertEquals(List.of("Serine"), translator.translate("UCU"));
    }

    @DisplayName("Serine RNA sequence 2")
    @Test
    public void testSerineRnaSequence2() {
        assertEquals(List.of("Serine"), translator.translate("UCC"));
    }

    @DisplayName("Serine RNA sequence 3")
    @Test
    public void testSerineRnaSequence3() {
        assertEquals(List.of("Serine"), translator.translate("UCA"));
    }

    @DisplayName("Serine RNA sequence 4")
    @Test
    public void testSerineRnaSequence4() {
        assertEquals(List.of("Serine"), translator.translate("UCG"));
    }

    @DisplayName("Tyrosine RNA sequence 1")
    @Test
    public void testTyrosineRnaSequence1() {
        assertEquals(List.of("Tyrosine"), translator.translate("UAU"));
    }

    @DisplayName("Tyrosine RNA sequence 2")
    @Test
    public void testTyrosineRnaSequence2() {
        assertEquals(List.of("Tyrosine"), translator.translate("UAC"));
    }

    @DisplayName("Cysteine RNA sequence 1")
    @Test
    public void testCysteineRnaSequence1() {
        assertEquals(List.of("Cysteine"), translator.translate("UGU"));
    }

    @DisplayName("Cysteine RNA sequence 2")
    @Test
    public void testCysteineRnaSequence2() {
        assertEquals(List.of("Cysteine"), translator.translate("UGC"));
    }

    @DisplayName("Tryptophan RNA sequence")
    @Test
    public void testTryptophanRnaSequence() {
        assertEquals(List.of("Tryptophan"), translator.translate("UGG"));
    }

    @DisplayName("STOP codon RNA sequence 1")
    @Test
    public void testStopCodonRnaSequence1() {
        assertEquals(Collections.emptyList(), translator.translate("UAA"));
    }

    @DisplayName("STOP codon RNA sequence 2")
    @Test
    public void testStopCodonRnaSequence2() {
        assertEquals(Collections.emptyList(), translator.translate("UAG"));
    }

    @DisplayName("STOP codon RNA sequence 3")
    @Test
    public void testStopCodonRnaSequence3() {
        assertEquals(Collections.emptyList(), translator.translate("UGA"));
    }

    @DisplayName("Sequence of two different protein codons translates into proteins")
    @Test
    public void testSequenceOfTwoDifferentProteinCodons() {
        assertEquals(List.of("Leucine", "Leucine"),  translator.translate("UUAUUG"));
    }

    @DisplayName("Sequence of three different protein codons translates into proteins")
    @Test
    public void testSequenceOfThreeDifferentProteinCodons() {
        assertEquals(List.of("Methionine", "Phenylalanine", "Tryptophan"), translator.translate("AUGUUUUGG"));
    }

    @DisplayName("Translation stops if STOP codon at beginning of sequence")
    @Test
    public void testStopCodonStopCodonAtBeginningOfSequence() {
        assertEquals(Collections.emptyList(), translator.translate("UAGUGG"));
    }

    @DisplayName("Translation stops if STOP codon at end of two-codon sequence")
    @Test
    public void testStopCodonStopCodonAtEndOfTwoCodonSequence() {
        assertEquals(List.of("Tryptophan"), translator.translate("UGGUAG"));
    }

    @DisplayName("Translation stops if STOP codon at end of three-codon sequence")
    @Test
    public void testStopCodonStopCodonAtEndOfThreeCodonSequence() {
        assertEquals(List.of("Methionine", "Phenylalanine"), translator.translate("AUGUUUUAA"));
    }

    @DisplayName("Translation stops if STOP codon in middle of three-codon sequence")
    @Test
    public void testStopCodonStopCodonInMiddleOfThreeCodonSequence() {
        assertEquals(List.of("Tryptophan"), translator.translate("UGGUAGUGG"));
    }

    @DisplayName("Translation stops if STOP codon in middle of six-codon sequence")
    @Test
    public void testStopCodonStopCodonInMiddleOfSixCodonSequence() {
        assertEquals(List.of("Tryptophan", "Cysteine", "Tyrosine"), translator.translate("UGGUGUUAUUAAUGGUUU"));
    }

    @DisplayName("Sequence of two non-STOP codons does not translate to a STOP codon")
    @Test
    public void testSequenceOfTwoNonStopCodons() {
        assertEquals(List.of("Methionine", "Methionine"), translator.translate("AUGAUG"));
    }

    @DisplayName("Non-existing codon can't translate")
    @Test
    public void testNonExistingCodon() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> translator.translate("AAA"));
        assertEquals("Invalid codon", e.getMessage());
    }

    @DisplayName("Unknown amino acids, not part of a codon, can't translate")
    @Test
    public void testUnknownAminoAcids() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> translator.translate("XYZ"));
        assertEquals("Invalid codon", e.getMessage());
    }

    @DisplayName("Incomplete RNA sequence can't translate")
    @Test
    public void testIncompleteRnaSequence() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> translator.translate("AUGU"));
        assertEquals("Invalid codon", e.getMessage());
    }

    @DisplayName("Incomplete RNA sequence can translate if valid until a STOP codon")
    @Test
    public void testIncompleteRnaSequenceIfValidUntilAStopCodon() {
        assertEquals(List.of("Phenylalanine", "Phenylalanine"), translator.translate("UUCUUCUAAUGGU"));
    }
}