/**
 * OOPSBannerApp - UC4
 * Prints "OOPS" banner using String array and loop
 *
 * @author Anushka
 * @version 4.0
 */
public class uc4 {
    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*   *"),
            String.join(" ", "*   *", "*   *", "*   *", "*   *"),
            String.join(" ", "*   *", "*   *", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*", "*"),
            String.join(" ", "*   *", "*   *", "*", "*"),
            String.join(" ", "*****", "*****", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}