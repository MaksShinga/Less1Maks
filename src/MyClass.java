public class MyClass {
    int year = 2023;
    public static int sumOfTwoNumbers(int a, int b){
        int c = a + b;
        return c;}

    public static int shuwResult(int number) {
        if (number < 100 || number > 999) {
            throw new IllegalArgumentException("Потрібно передати трьохзначне число.");
        }
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        int sum = digit1 + digit2 + digit3;

        return sum;
    }
    public static int showResult(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int sum = length1 + length2;

        return sum;
    }
    public static boolean showResult(int number) {
        if (number > 0) {
            System.out.println("Число більше 0.");
            return true;
        } else {
            System.out.println("Число менше 0.");
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Сума цифр числа дорівнює " + shuwResult(234));
        System.out.println("Сума довжин слів дорівнює " + showResult("Happy", "Birthday"));
        System.out.println(showResult(3));
    }
}
