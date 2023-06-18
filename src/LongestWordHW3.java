public class LongestWordHW3 {
    public static String findLongestWord(String word1, String word2, String word3) {
        if (word1.length() > word2.length() && word1.length() > word3.length()) {
            return word1;
        } else if (word2.length() > word1.length() && word2.length() > word3.length()) {
            return word2;
        } else {
            return word3;
        }
    }
    public static void printPattern() {
        int n = 5; // Кількість рядків

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Найдовше слово " + findLongestWord("Port", "Car", "Monkey"));
    }
}
