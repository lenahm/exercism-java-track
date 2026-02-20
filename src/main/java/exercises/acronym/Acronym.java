package exercises.acronym;

public class Acronym {

    private final String phrase;

    public Acronym(String phrase) {
        this.phrase = phrase == null ? "" : phrase;
    }

    public String get() {
        String[] parts = phrase.split("[\\s-_]+");

        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            for (int i = 0; i < part.length(); i++) {
                char c = part.charAt(i);
                if (Character.isLetter(c)) {
                    sb.append(Character.toUpperCase(c));
                    break;
                }
            }
        }
        return sb.toString();
    }
}
