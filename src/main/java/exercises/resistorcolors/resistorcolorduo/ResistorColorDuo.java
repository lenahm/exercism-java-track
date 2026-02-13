package exercises.resistorcolors.resistorcolorduo;

import exercises.resistorcolors.ResistorColorCodes;

public class ResistorColorDuo {

    public int value(String[] colors) {
        int result = 0;
        for (int i = 0; i < Math.min(2, colors.length); i++) {
            result = result * 10 + ResistorColorCodes.COLORS.get(colors[i]);
        }
        return result;
    }
}
