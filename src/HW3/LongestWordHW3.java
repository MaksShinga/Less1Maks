package HW3;

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
    public static void main(String[] args) {
        System.out.println("Найдовше слово " + findLongestWord("Port", "Car", "Monkey"));
    }
}
