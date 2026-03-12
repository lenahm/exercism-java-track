package exercises.eliudseggs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EliudsEggsTest {

    private EliudsEggs eliudsEggs;

    @BeforeEach
    public void setUp() {
        eliudsEggs = new EliudsEggs();
    }

    @Test
    @DisplayName("Decimal 0 should return 0")
    public void testEliudsEggs1() {
        assertEquals(0, eliudsEggs.eggCount(0));
    }

    @Test
    @DisplayName("Decimal 16 should return 1")
    public void testEliudsEggs2() {
        assertEquals(1, eliudsEggs.eggCount(16));
    }

    @Test
    @DisplayName("Decimal 89 should return 4")
    public void testEliudsEggs3() {
        assertEquals(4, eliudsEggs.eggCount(89));
    }

    @Test
    @DisplayName("Decimal 2000000000 should return 13")
    public void testEliudsEggs4() {
        assertEquals(13, eliudsEggs.eggCount(2000000000));
    }
}
