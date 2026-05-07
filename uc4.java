public class uc4 {

    public static void main(String[] args) {

        // Array to store banner lines
        String[] banner = new String[5];

        // Populate banner lines
        banner[0] = String.join("   ",
                " OOO ",
                " OOO ",
                "PPPP ",
                " SSS ");

        banner[1] = String.join("   ",
                "O   O",
                "O   O",
                "P   P",
                "S    ");

        banner[2] = String.join("   ",
                "O   O",
                "O   O",
                "PPPP ",
                " SSS ");

        banner[3] = String.join("   ",
                "O   O",
                "O   O",
                "P    ",
                "    S");

        banner[4] = String.join("   ",
                " OOO ",
                " OOO ",
                "P    ",
                " SSS ");

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
