package exercises.resistorcolortrio;

import exercises.resistorcolorduo.ResistorColorDuo;

import java.util.Map;

public class ResistorColorTrio {

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

    public String label(String[] colors) {
        // the first two color bands form the base value (handled by ResistorColorDuo)
        String baseValue = String.valueOf(new ResistorColorDuo().value(colors));

        // the third band defines how many zeros must be appended
        int zeroCount = COLORS.get(colors[2]);

        // build the full resistor value by appending the required number of zeros
        long fullValue = Long.parseLong(baseValue + "0".repeat(zeroCount));

        return ResistorUnit.format(fullValue);
    }
}
