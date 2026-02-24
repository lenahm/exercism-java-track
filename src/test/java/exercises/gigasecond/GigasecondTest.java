package exercises.gigasecond;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GigasecondTest {

    @DisplayName("Only date as input - test 1")
    @Test
    public void shouldReturnCorrectDateAndTimeForOnlyDateAsInput1() {
        Gigasecond gigasecond = new Gigasecond(LocalDate.of(2011, Month.APRIL, 25));
        assertEquals(LocalDateTime.of(2043, Month.JANUARY, 1, 1, 46, 40), gigasecond.getDateTime());
    }

    @DisplayName("Only date as input - test 2")
    @Test
    public void shouldReturnCorrectDateAndTimeForOnlyDateAsInput2() {
        Gigasecond gigasecond = new Gigasecond(LocalDate.of(1977, Month.JUNE, 13));
        assertEquals(LocalDateTime.of(2009, Month.FEBRUARY, 19, 1, 46, 40), gigasecond.getDateTime());
    }

    @DisplayName("Only date as input - test 3")
    @Test
    public void shouldReturnCorrectDateAndTimeForOnlyDateAsInput3() {
        Gigasecond gigasecond = new Gigasecond(LocalDate.of(1959, Month.JULY, 19));
        assertEquals(LocalDateTime.of(1991, Month.MARCH, 27, 1, 46, 40), gigasecond.getDateTime());
    }

    @DisplayName("Date and time as input - test 1")
    @Test
    public void shouldReturnCorrectDateAndTimeForDateAndTimeAsInput1() {
        Gigasecond gigasecond = new Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 22, 0, 0));
        assertEquals(LocalDateTime.of(2046, Month.OCTOBER, 2, 23, 46, 40),  gigasecond.getDateTime());
    }

    @DisplayName("Date and time as input - test 2")
    @Test
    public void shouldReturnCorrectDateAndTimeForDateAndTimeAsInput2() {
        Gigasecond gigasecond = new Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 23, 59, 59));
        assertEquals(LocalDateTime.of(2046, Month.OCTOBER, 3, 1, 46, 39),  gigasecond.getDateTime());
    }
}
