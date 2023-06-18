public class MonthHW3 {
    public static void getDaysInMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("Січень 2023 має 31 день");
                break;
            case 2:
                System.out.println("Лютий 2023 має 28 днів");
                break;
            case 3:
                System.out.println("Березень 2023 має 31 день");
                break;
            case 4:
                System.out.println("Квітень 2023 має 30 днів");
                break;
            case 5:
                System.out.println("Травень 2023 має 31 день");
                break;
            case 6:
                System.out.println("Червень 2023 має 30 днів");
                break;
            case 7:
                System.out.println("Липень 2023 має 31 день");
                break;
            case 8:
                System.out.println("Серпень 2023 має 31 день");
                break;
            case 9:
                System.out.println("Вересень 2023 має 30 днів");
                break;
            case 10:
                System.out.println("Жовтень 2023 має 31 день");
                break;
            case 11:
                System.out.println("Листопад 2023 має 30 днів");
                break;
            case 12:
                System.out.println("Грудень 2023 має 31 день");
                break;
            default:
                System.out.println("Неправильний номер місяця");
                break;
        }
    }

    public static void main(String[] args) {
        int monthNumber = 9;
        getDaysInMonth(monthNumber);
    }
}
