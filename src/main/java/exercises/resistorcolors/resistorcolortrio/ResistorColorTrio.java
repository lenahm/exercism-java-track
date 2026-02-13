package exercises.resistorcolors.resistorcolortrio;

import exercises.resistorcolors.ResistorColorCodes;
import exercises.resistorcolors.resistorcolorduo.ResistorColorDuo;

public class ResistorColorTrio {

    public String label(String[] colors) {
        // the first two color bands form the base value (handled by ResistorColorDuo)
        String baseValue = String.valueOf(new ResistorColorDuo().value(colors));

        // the third band defines how many zeros must be appended
        int zeroCount = ResistorColorCodes.COLORS.get(colors[2]);

        // build the full resistor value by appending the required number of zeros
        long fullValue = Long.parseLong(baseValue + "0".repeat(zeroCount));

        return ResistorUnit.format(fullValue);
    }
}
