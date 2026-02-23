package exercises.differenceofsquares;

public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int input) {
        int sumOfNaturalNumbers = 0;
        for (int i = 1; i <= input; i++) {
            sumOfNaturalNumbers += i;
        }
        return (int) Math.pow(sumOfNaturalNumbers, 2);
    }

    public int computeSumOfSquaresTo(int input) {
        int sumOfSquares = 0;
        for (int i = 1; i <= input; i++) {
            sumOfSquares += (int) Math.pow(i, 2);
        }
        return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
