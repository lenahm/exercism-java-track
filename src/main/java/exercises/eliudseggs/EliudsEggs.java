package exercises.eliudseggs;

public class EliudsEggs {

    public int eggCount(int number) {
        String binary = Integer.toBinaryString(number);
        return (int) binary
                .chars()
                .filter(c -> c == '1')
                .count();
    }
}
