package exercises.resistorcolorduo;

import java.util.Map;

public class ResistorColorDuo {

    private final Map<String, Integer> COLORS = Map.of(
            "black", 0,
            "brown", 1,
            "red", 2,
            "orange", 3,
            "yellow", 4,
            "green", 5,
            "blue", 6,
            "violet", 7,
            "grey", 8,
            "white", 9
    );

    public int value(String[] colors) {
        int result = 0;
        for (int i = 0; i < Math.min(2, colors.length); i++) {
            result = result * 10 + COLORS.get(colors[i]);
        }
        return result;
    }
}
