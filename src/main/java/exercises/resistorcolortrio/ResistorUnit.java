package exercises.resistorcolortrio;

public enum ResistorUnit {

    GIGA(1_000_000_000L, "gigaohms"),
    MEGA(1_000_000L, "megaohms"),
    KILO(1_000L, "kiloohms"),
    OHMS(1L, "ohms");

    public final long divisor;
    public final String label;

    ResistorUnit(long divisor, String label) {
        this.divisor = divisor;
        this.label = label;
    }

    public static String format(long value) {
        for (ResistorUnit unit : values()) {
            if (value >= unit.divisor) {
                return (value / unit.divisor) + " " + unit.label;
            }
        }
        return "0 ohms";
    }
}
