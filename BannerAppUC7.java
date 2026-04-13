public class BannerAppUC7 {

    // Static inner class to encapsulate character + pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getters
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create CharacterPatternMap objects for each unique character
        CharacterPatternMap letterO = new CharacterPatternMap('O', new String[] {
            " OOO  ",
            "O   O ",
            "O   O ",
            "O   O ",
            "O   O ",
            "O   O ",
            " OOO  "
        });

        CharacterPatternMap letterP = new CharacterPatternMap('P', new String[] {
            "PPPP  ",
            "P   P ",
            "P   P ",
            "PPPP  ",
            "P     ",
            "P     ",
            "P     "
        });

        CharacterPatternMap letterS = new CharacterPatternMap('S', new String[] {
            " SSS  ",
            "S     ",
            "S     ",
            " SSS  ",
            "    S ",
            "    S ",
            " SSS  "
        });

        // Build the banner word "OOPS"
        // O appears twice - reuse letterO object
        CharacterPatternMap[] bannerWord = { letterO, letterO, letterP, letterS };

        System.out.println("=== UC7 Banner : OOPS ===");
        System.out.println();

        // Row-by-row rendering using getPattern()
        int rows = 7;
        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap cpm : bannerWord) {
                line.append(cpm.getPattern()[row]);
            }
            System.out.println(line.toString());
        }

        System.out.println();
        System.out.println("Banner rendered using CharacterPatternMap class.");
    }
}