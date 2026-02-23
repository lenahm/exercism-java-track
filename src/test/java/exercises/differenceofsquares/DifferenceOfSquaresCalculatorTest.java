package exercises.differenceofsquares;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceOfSquaresCalculatorTest {

    private DifferenceOfSquaresCalculator differenceOfSquaresCalculator;

    @BeforeEach
    public void setUp() {
        differenceOfSquaresCalculator = new DifferenceOfSquaresCalculator();
    }

    @DisplayName("Square of sum 1")
    @Test
    public void shouldCalculateSquareOfSum1() {
        assertEquals(1, differenceOfSquaresCalculator.computeSquareOfSumTo(1));
    }

    @DisplayName("Square of sum 5")
    @Test
    public void shouldCalculateSquareOfSum5() {
        assertEquals(225, differenceOfSquaresCalculator.computeSquareOfSumTo(5));
    }

    @DisplayName("Square of sum 100")
    @Test
    public void shouldCalculateSquareOfSum100() {
        assertEquals(25502500, differenceOfSquaresCalculator.computeSquareOfSumTo(100));
    }

    @DisplayName("Sum of squares 1")
    @Test
    public void shouldCalculateSumOfSquares1() {
        assertEquals(1, differenceOfSquaresCalculator.computeSumOfSquaresTo(1));
    }

    @DisplayName("Sum of squares 5")
    @Test
    public void shouldCalculateSumOfSquares5() {
        assertEquals(55, differenceOfSquaresCalculator.computeSumOfSquaresTo(5));
    }

    @DisplayName("Sum of squares 100")
    @Test
    public void shouldCalculateSumOfSquares100() {
        assertEquals(338350, differenceOfSquaresCalculator.computeSumOfSquaresTo(100));
    }

    @DisplayName("Differences of squares 1")
    @Test
    public void shouldCalculateDifferencesOfSquares1() {
        assertEquals(0, differenceOfSquaresCalculator.computeDifferenceOfSquares(1));
    }

    @DisplayName("Differences of squares 5")
    @Test
    public void shouldCalculateDifferencesOfSquares5() {
        assertEquals(170, differenceOfSquaresCalculator.computeDifferenceOfSquares(5));
    }

    @DisplayName("Differences of squares 100")
    @Test
    public void shouldCalculateDifferencesOfSquares100() {
        assertEquals(25164150, differenceOfSquaresCalculator.computeDifferenceOfSquares(100));
    }
}
