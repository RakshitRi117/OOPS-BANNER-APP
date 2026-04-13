public class BannerApp {

    public static String[] buildLetterO() {
        return new String[] {
            " OOO  ",
            "O   O ",
            "O   O ",
            "O   O ",
            "O   O ",
            "O   O ",
            " OOO  "
        };
    }

    public static String[] buildLetterP() {
        return new String[] {
            "PPPP  ",
            "P   P ",
            "P   P ",
            "PPPP  ",
            "P     ",
            "P     ",
            "P     "
        };
    }

    public static String[] buildLetterS() {
        return new String[] {
            " SSS  ",
            "S     ",
            "S     ",
            " SSS  ",
            "    S ",
            "    S ",
            " SSS  "
        };
    }

    public static void main(String[] args) {

        String[] letterO = buildLetterO();
        String[] letterP = buildLetterP();
        String[] letterS = buildLetterS();

        String[][] bannerWord = { letterO, letterP, letterS };

        System.out.println("=== UC6 Banner : OPS ===");
        System.out.println();

        int rows = letterO.length;
        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();
            for (String[] character : bannerWord) {
                line.append(character[row]);
            }
            System.out.println(line.toString());
        }

        System.out.println();
        System.out.println("Banner rendered successfully using modular helper methods.");
    }
}