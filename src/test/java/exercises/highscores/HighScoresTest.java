package exercises.highscores;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighScoresTest {

    @Test
    @DisplayName("Variable highScores should contain all scores in original order")
    public void shouldReturnListOfScores() {
        HighScores highScores = new HighScores(Arrays.asList(30, 50, 20, 70));
        assertEquals(Arrays.asList(30, 50, 20, 70), highScores.scores());
    }

    @Test
    @DisplayName("Latest score is 30")
    public void shouldReturnLatestAddedScore() {
        HighScores highScores = new HighScores(Arrays.asList(100, 0, 90, 30));
        assertEquals(30, highScores.latest());
    }

    @Test
    @DisplayName("Maximum ('personal best') is 120")
    public void shouldReturnPersonalBest1() {
        HighScores highScores = new HighScores(Arrays.asList(30, 50, 20, 70, 120, 80, 10));
        assertEquals(120, highScores.personalBest());
    }

    @Test
    @DisplayName("Maximum ('personal best') is 220")
    public void shouldReturnPersonalBest2() {
        HighScores highScores = new HighScores(Arrays.asList(5, 40, 20, 220, 180, 190, 10));
        assertEquals(220, highScores.personalBest());
    }

    @Test
    @DisplayName("Personal top three from a list of scores")
    public void shouldReturnPersonalTopThreeFromAListOfScores() {
        HighScores highScores = new HighScores(Arrays.asList(10, 30, 90, 30, 100, 20, 10, 0, 30, 40, 40, 70, 70));
        assertEquals(Arrays.asList(100, 90, 70), highScores.personalTopThree());
    }

    @Test
    @DisplayName("Personal top are ordered from highest to lowest")
    public void shouldReturnPersonalTopAreOrderedFromHighestToLowest() {
        HighScores highScores = new HighScores(Arrays.asList(20, 10, 30));
        assertEquals(Arrays.asList(30, 20, 10), highScores.personalTopThree());
    }

    @Test
    @DisplayName("Personal top three from a list of scores with a tie")
    public void shouldReturnPersonalTopThreeFromAListOfScoresWithATie() {
        HighScores highScores = new HighScores(Arrays.asList(40, 20, 40, 30));
        assertEquals(Arrays.asList(40, 40, 30), highScores.personalTopThree());
    }

    @Test
    @DisplayName("Personal top three from a list of scores with less than 3 entries")
    public void shouldReturnPersonalTopThreeFromAListOfScoresWithLessThanThreeScores() {
        HighScores highScores = new HighScores(Arrays.asList(30, 70));
        assertEquals(Arrays.asList(70, 30), highScores.personalTopThree());
    }

    @Test
    @DisplayName("Personal top three from a list of scores with only 1 entry")
    public void shouldReturnPersonalTopThreeFromAListOfScoresWithOnlyOneScore() {
        HighScores highScores = new HighScores(Arrays.asList(40));
        assertEquals(Arrays.asList(40), highScores.personalTopThree());
    }

    @Test
    @DisplayName("Call method for latest score after method for personal top three scores")
    public void callingLatestAfterPersonalTopThree() {
        HighScores highScores = new HighScores(Arrays.asList(70, 50, 20, 30));
        highScores.personalTopThree();
        assertEquals(30, highScores.latest());
    }

    @Test
    @DisplayName("Call method for all scores after method for personal top three scores")
    public void callingAllScoresAfterPersonalTopThree() {
        HighScores highScores = new HighScores(Arrays.asList(30, 50, 20, 70));
        highScores.personalTopThree();
        assertEquals(Arrays.asList(30, 50, 20, 70), highScores.scores());
    }

    @Test
    @DisplayName("Call method for latest score after method for personal top score")
    public void callingLatestAfterPersonalTopScore() {
        HighScores highScores = new HighScores(Arrays.asList(20, 70, 15, 25, 30));
        highScores.personalBest();
        assertEquals(30, highScores.latest());
    }

    @Test
    @DisplayName("Call method for all scores after method for personal top score")
    public void callingAllScoresAfterPersonalTopScore() {
        HighScores highScores = new HighScores(Arrays.asList(20, 70, 15, 25, 30));
        highScores.personalBest();
        assertEquals(Arrays.asList(20, 70, 15, 25, 30),  highScores.scores());
    }
}
