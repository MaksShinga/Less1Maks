public class TreesOfStars {
    public static void firstTreeOfStars() {
        int n = 5;

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
    public static void secondTreeOfStars() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void thirdTreeOfStars() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
       firstTreeOfStars();
       secondTreeOfStars();
       thirdTreeOfStars();
    }
}
