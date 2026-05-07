import java.util.HashMap;
import java.util.Map;

public class uc8 {

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patterns) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("   ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // HashMap to store patterns
        Map<Character, String[]> patterns = new HashMap<>();

        // O Pattern
        patterns.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        // P Pattern
        patterns.put('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        // S Pattern
        patterns.put('S', new String[]{
                " SSS ",
                "S    ",
                " SSS ",
                "    S",
                " SSS "
        });

        // Render OOPS
        renderBanner("OOPS", patterns);
    }
}
