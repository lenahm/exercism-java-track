package exercises.rnatranscription;

public class RnaTranscription {

    public String transcribe(String dnaStrand) {
        if (dnaStrand == null || dnaStrand.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder(dnaStrand.length());
        for (char nucleotide : dnaStrand.toCharArray()) {
            switch (nucleotide) {
                case 'G' -> sb.append('C');
                case 'C' -> sb.append('G');
                case 'T' -> sb.append('A');
                case 'A' -> sb.append('U');
            }
        }
        return sb.toString();
    }
}
