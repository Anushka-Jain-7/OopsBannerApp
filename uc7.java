public class uc7 {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter method
        public char getCharacter() {
            return character;
        }

        // Getter method
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // O pattern
        CharacterPatternMap O = new CharacterPatternMap('O',
                new String[]{
                        " OOO ",
                        "O   O",
                        "O   O",
                        "O   O",
                        " OOO "
                });

        // P pattern
        CharacterPatternMap P = new CharacterPatternMap('P',
                new String[]{
                        "PPPP ",
                        "P   P",
                        "PPPP ",
                        "P    ",
                        "P    "
                });

        // S pattern
        CharacterPatternMap S = new CharacterPatternMap('S',
                new String[]{
                        " SSS ",
                        "S    ",
                        " SSS ",
                        "    S",
                        " SSS "
                });

        // Store word OOPS
        CharacterPatternMap[] word = {O, O, P, S};

        // Print banner
        for (int row = 0; row < 5; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap letter : word) {
                line.append(letter.getPattern()[row]).append("   ");
            }

            System.out.println(line);
        }
    }
}