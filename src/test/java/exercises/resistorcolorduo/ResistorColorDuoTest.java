package exercises.resistorcolorduo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResistorColorDuoTest {

    private ResistorColorDuo resistorColorDuo;

    @BeforeEach
    public void setUp() {
        resistorColorDuo = new ResistorColorDuo();
    }

    @Test
    @DisplayName("Value for brown and black")
    public void shouldReturnCorrectValueForBrownAndBlack() {
        assertEquals(10, resistorColorDuo.value(new String[]{"brown", "black"}));
    }

    @Test
    @DisplayName("Value for blue and grey")
    public void shouldReturnCorrectValueForBlueAndGrey() {
        assertEquals(68, resistorColorDuo.value(new String[]{"blue", "grey"}));
    }

    @Test
    @DisplayName("Value for yellow and violet")
    public void shouldReturnCorrectValueForYellowAndViolet() {
        assertEquals(47,  resistorColorDuo.value(new String[]{"yellow", "violet"}));
    }

    @Test
    @DisplayName("Value for orange and orange")
    public void shouldReturnCorrectValueForOrangeAndOrange() {
        assertEquals(33,  resistorColorDuo.value(new String[]{"orange", "orange"}));
    }

    @Test
    @DisplayName("Value for white and red")
    public void shouldReturnCorrectValueForWhiteAndRed() {
        assertEquals(92,  resistorColorDuo.value(new String[]{"white", "red"}));
    }

    @Test
    @DisplayName("Value for black and brown, ignore leading zero")
    public void shouldReturnCorrectValueForBlackAndBrown() {
        assertEquals(1, resistorColorDuo.value(new String[]{"black", "brown"}));
    }

    @Test
    @DisplayName("Consider only the first two colors")
    public void shouldIgnoreAdditionalColors() {
        assertEquals(51, resistorColorDuo.value(new String[]{"green", "brown", "orange"}));
    }
}
