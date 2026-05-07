public class uc6 {

    // Static method to generate O pattern
    public static String getO() {
        return " OOO ";
    }

    // Static method to generate P pattern
    public static String getP() {
        return " PPP ";
    }

    // Static method to generate S pattern
    public static String getS() {
        return " SSS ";
    }

    public static void main(String[] args) {

        String[] banner = {

                getO() + "   " + getP() + "   " + getS(),

                "O   O" + "   " + "P   P" + "   " + "S    ",

                "O   O" + "   " + "PPPP " + "   " + " SSS ",

                "O   O" + "   " + "P    " + "   " + "    S",

                getO() + "   " + "P    " + "   " + getS()
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}