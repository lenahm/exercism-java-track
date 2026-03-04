package exercises.perfectnumbers;

public class NaturalNumber {

    private final int number;
    private int aliquotSum;

    public NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
        calculateAliquotSum(number);
    }

    private void calculateAliquotSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        this.aliquotSum = sum;
    }

    public Classification getClassification() {
        if (this.number < this.aliquotSum) {
            return Classification.ABUNDANT;
        }
        if (this.number > this.aliquotSum) {
            return Classification.DEFICIENT;
        }
        return Classification.PERFECT;
    }
}
