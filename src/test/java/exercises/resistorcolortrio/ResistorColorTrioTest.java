package exercises.resistorcolortrio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResistorColorTrioTest {

    private ResistorColorTrio resistorColorTrio;

    @BeforeEach
    public void setUp() {
        resistorColorTrio = new ResistorColorTrio();
    }

    @Test
    @DisplayName("Label for orange - orange - black")
    public void shouldReturnCorrectLabelForOrangeOrangeBlack() {
        assertEquals("33 ohms", resistorColorTrio.label(new String[]{"orange", "orange", "black"}));
    }

    @Test
    @DisplayName("Label for blue - grey- brown")
    public void shouldReturnCorrectLabelForBlueGreyBrown() {
        assertEquals("680 ohms", resistorColorTrio.label(new String[]{"blue", "grey", "brown"}));
    }

    @Test
    @DisplayName("Label for red - black - red")
    public void shouldReturnCorrectLabelForRedBlackRed() {
        assertEquals("2 kiloohms", resistorColorTrio.label(new String[]{"red", "black", "red"}));
    }

    @Test
    @DisplayName("Label for green - brown - orange")
    public void shouldReturnCorrectLabelForGreenBrownOrange() {
        assertEquals("51 kiloohms", resistorColorTrio.label(new String[]{"green", "brown", "orange"}));
    }

    @Test
    @DisplayName("Label for yellow - violet - yellow")
    public void shouldReturnCorrectLabelForYellowVioletYellow() {
        assertEquals("470 kiloohms", resistorColorTrio.label(new String[]{"yellow", "violet", "yellow"}));
    }

    @Test
    @DisplayName("Label for blue - violet - blue")
    public void shouldReturnCorrectLabelForBlueVioletBlue() {
        assertEquals("67 megaohms", resistorColorTrio.label(new String[]{"blue", "violet", "blue"}));
    }

    @Test
    @DisplayName("Label for black - black - black")
    public void shouldReturnCorrectLabelForBlackBlackBlack() {
        assertEquals("0 ohms",  resistorColorTrio.label(new String[]{"black", "black", "black"}));
    }

    @Test
    @DisplayName("Label for white - white - white")
    public void shouldReturnCorrectLabelForWhiteWhiteWhite() {
        assertEquals("99 gigaohms", resistorColorTrio.label(new String[]{"white", "white", "white"}));
    }

    @Test
    @DisplayName("Label for black - grey - black")
    public void shouldReturnCorrectLabelForBlackGreyBlack() {
        assertEquals("8 ohms", resistorColorTrio.label(new String[]{"black", "grey", "black"}));
    }

    @Test
    @DisplayName("Consider only the first three colors")
    public void shouldIgnoreAdditionalColors() {
        assertEquals("650 kiloohms", resistorColorTrio.label(new String[]{"blue", "green", "yellow", "orange"}));
    }
}
