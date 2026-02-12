package exercises.resistorcolor;

import java.util.Map;

public class ResistorColor {

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

    public int colorCode(String color) {
        return COLORS.get(color);
    }

    public String[] colors() {
        return COLORS.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
    }
}
