package HW7;

public class DivideArrays {
    public static void divideArrayElements(int[] array, int divisor) {
        try {
            int[] dividedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                dividedArray[i] = array[i] / divisor;
            }
            System.out.println("Divided array:");
            for (int element : dividedArray) {
                System.out.println(element);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 8, 0, 20};

        divideArrayElements(numbers, 2);
    }
}
