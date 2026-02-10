package exercises.grains;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GrainsTest {

    private final Grains grains = new Grains();

    @Test
    @DisplayName("Square 1 should contain exactly 1 grain")
    public void countAtSquare1() {
        BigInteger result = grains.grainsOnSquare(1);
        assertEquals(BigInteger.ONE, result);
    }

    @Test
    @DisplayName("Square 2 should contain exactly 2 grains")
    public void countAtSquare2() {
        BigInteger result = grains.grainsOnSquare(2);
        assertEquals(BigInteger.TWO, result);
    }

    @Test
    @DisplayName("Square 3 should contain exactly 4 grains")
    public void countAtSquare3() {
        BigInteger result = grains.grainsOnSquare(3);
        assertEquals(BigInteger.valueOf(4), result);
    }

    @Test
    @DisplayName("Square 4 should contain exactly 8 grains")
    public void countAtSquare4() {
        BigInteger result = grains.grainsOnSquare(4);
        assertEquals(BigInteger.valueOf(8), result);
    }

    @Test
    @DisplayName("Square 16 should contain exactly 32768 grains")
    public void countAtSquare16() {
        BigInteger result = grains.grainsOnSquare(16);
        assertEquals(BigInteger.valueOf(32768), result);
    }

    @Test
    @DisplayName("Square 32 should contain exactly 2147483648 grains")
    public void countAtSquare32() {
        BigInteger result = grains.grainsOnSquare(32);
        assertEquals(BigInteger.valueOf(2147483648L), result);
    }

    @Test
    @DisplayName("Square 64 should contain exactly 9223372036854775808 grains")
    public void countAtSquare64() {
        BigInteger result = grains.grainsOnSquare(64);
        assertEquals(new BigInteger("9223372036854775808"), result);
    }

    @Test
    @DisplayName("Square 0 is invalid")
    public void countAtSquare0() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> grains.grainsOnSquare(0));
        assertEquals("square must be between 1 and 64", e.getMessage());
    }

    @Test
    @DisplayName("Square -1 is invalid")
    public void countAtNegativeSquare() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> grains.grainsOnSquare(-1));
        assertEquals("square must be between 1 and 64", e.getMessage());
    }

    @Test
    @DisplayName("Square 65 is invalid")
    public void countAtSquare65() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> grains.grainsOnSquare(65));
        assertEquals("square must be between 1 and 64", e.getMessage());
    }

    @Test
    @DisplayName("Total number of grains on board is exactly 18446744073709551615")
    public void countTotalNumberOfGrainsOnBoard() {
        BigInteger result = grains.grainsOnBoard();
        assertEquals(new BigInteger("18446744073709551615"), result);
    }
}
