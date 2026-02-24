package exercises.hamming;

public class Hamming {

    private final String leftStrand;
    private final String rightStrand;
    private int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        calculateHammingDistance();
    }

    private void calculateHammingDistance() {
        for (int i = 0; i < this.leftStrand.length(); i++) {
            if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
                this.hammingDistance++;
            }
        }
    }

    public int getHammingDistance() {
        return this.hammingDistance;
    }
}
