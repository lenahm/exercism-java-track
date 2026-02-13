package exercises.resistorcolors;

import exercises.resistorcolors.resistorcolor.ResistorColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResistorColorTest {

    private ResistorColor resistorColor;

    @BeforeEach
    public void setUp() {
        resistorColor = new ResistorColor();
    }

    @Test
    @DisplayName("Color code for black")
    public void shouldReturnCorrectColorCodeForBlack() {
        assertEquals(0, resistorColor.colorCode("black"));
    }

    @Test
    @DisplayName("Color code for white")
    public void shouldReturnCorrectColorCodeForWhite() {
        assertEquals(9, resistorColor.colorCode("white"));
    }

    @Test
    @DisplayName("Color code for orange")
    public void shouldReturnCorrectColorCodeForOrange() {
        assertEquals(3, resistorColor.colorCode("orange"));
    }

    @Test
    @DisplayName("All color codes in correct order")
    public void shouldReturnListOfColorCodesInCorrectOrder() {
        assertArrayEquals(new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"}, resistorColor.colors());
    }
}
