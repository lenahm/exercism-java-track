package exercises.highscores;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HighScores {

    private final List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    public List<Integer> scores() {
        return this.highScores;
    }

    public Integer latest() {
        return this.highScores.getLast();
    }

    public Integer personalBest() {
        return Collections.max(this.highScores);
    }

    public List<Integer> personalTopThree() {
        return this.highScores.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
    }
}
