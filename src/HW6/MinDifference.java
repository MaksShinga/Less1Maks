package HW6;

public class MinDifference {
    public static void main(String[] args) {
        int[] numbers = {5, 11, 7, 20};
        findAndPrintMinDifference(numbers);
    }

    public static void findAndPrintMinDifference(int[] numbers) {
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int difference = Math.abs(numbers[i] - numbers[j]);
                if (difference < minDifference) {
                    minDifference = difference;
                }
            }
        }
        System.out.println("The smallest value of the difference between numbers modulo: " + minDifference);
    }
}
