public class TruthTable {
    // ANSI escape codes for colors
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String BLUE = "\033[0;34m";

    public static void main(String[] args) {
        boolean[] values = {false, true};

        System.out.println(BLUE + "A\tB\tA && B\tA || B" + RESET);
        for (boolean a : values) {
            for (boolean b : values) {
                System.out.println(
                    (a ? GREEN : RED) + a + "\t" + 
                    (b ? GREEN : RED) + b + "\t" + 
                    (a && b ? GREEN : RED) + (a && b) + "\t" + 
                    (a || b ? GREEN : RED) + (a || b) + RESET
                );
            }
        }
    }
}