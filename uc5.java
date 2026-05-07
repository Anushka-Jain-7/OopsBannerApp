public class  uc5{

    public static void main(String[] args) {

        String[] banner = {
                String.join("", java.util.Collections.nCopies(30, "*")),
                "*" + String.join("", java.util.Collections.nCopies(28, " ")) + "*",
                "*" + String.join("", java.util.Collections.nCopies(8, " ")) + "WELCOME" +
                        String.join("", java.util.Collections.nCopies(9, " ")) + "*",
                "*" + String.join("", java.util.Collections.nCopies(28, " ")) + "*",
                "*" + String.join("", java.util.Collections.nCopies(7, " ")) + "TO JAVA OOPS" +
                        String.join("", java.util.Collections.nCopies(6, " ")) + "*",
                "*" + String.join("", java.util.Collections.nCopies(28, " ")) + "*",
                String.join("", java.util.Collections.nCopies(30, "*"))
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}