import java.util.HashMap;

public class BannerAppUC8 {

    // Build the HashMap with character patterns
    public static HashMap<Character, String[]> buildPatternMap() {
        HashMap<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[] {
            " OOO  ",
            "O   O ",
            "O   O ",
            "O   O ",
            "O   O ",
            "O   O ",
            " OOO  "
        });

        patternMap.put('P', new String[] {
            "PPPP  ",
            "P   P ",
            "P   P ",
            "PPPP  ",
            "P     ",
            "P     ",
            "P     "
        });

        patternMap.put('S', new String[] {
            " SSS  ",
            "S     ",
            "S     ",
            " SSS  ",
            "    S ",
            "    S ",
            " SSS  "
        });

        return patternMap;
    }

    public static void main(String[] args) {

        // Build the pattern map
        HashMap<Character, String[]> patternMap = buildPatternMap();

        // Define the banner word
        String bannerWord = "OOPS";

        System.out.println("=== UC8 Banner : " + bannerWord + " ===");
        System.out.println();

        // Row-by-row rendering using HashMap lookup
        int rows = 7;
        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : bannerWord.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[row]);
                }
            }
            System.out.println(line.toString());
        }

        System.out.println();
        System.out.println("Banner rendered using HashMap pattern lookup.");
    }
}