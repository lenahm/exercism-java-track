package exercises.proteintranslation;

import java.util.ArrayList;
import java.util.List;

public class ProteinTranslator {

    public List<String> translate(String rnaSequence) {
        List<String> result = new ArrayList<>();

        for (String codon : splitIntoCodons(rnaSequence)) {
            switch (codon) {
                case "UAA", "UAG", "UGA" -> { return result; }
                case "AUG" -> result.add("Methionine");
                case "UUU", "UUC" -> result.add("Phenylalanine");
                case "UUA", "UUG" -> result.add("Leucine");
                case "UCU", "UCC", "UCA", "UCG" -> result.add("Serine");
                case "UAU", "UAC" -> result.add("Tyrosine");
                case "UGU", "UGC" -> result.add("Cysteine");
                case "UGG" -> result.add("Tryptophan");
                default -> throw new IllegalArgumentException("Invalid codon");
            }
        }
        return result;
    }

    private List<String> splitIntoCodons(String rnaSequence) {
        List<String> codons = new ArrayList<>();

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            int end = Math.min(i + 3, rnaSequence.length());
            codons.add(rnaSequence.substring(i, end));
        }
        return codons;
    }
}
