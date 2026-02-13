package exercises.resistorcolors.resistorcolor;

import exercises.resistorcolors.ResistorColorCodes;

import java.util.Map;

public class ResistorColor {

    public int colorCode(String color) {
        return ResistorColorCodes.COLORS.get(color);
    }

    public String[] colors() {
        return ResistorColorCodes.COLORS.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
    }
}
