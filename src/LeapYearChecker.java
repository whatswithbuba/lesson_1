public class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        // Год является високосным, если он:
        // 1. Делится на 4
        // 2. Не делится на 100, кроме случаев, когда он делится на 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Примеры использования метода
        System.out.println(isLeapYear(2020)); // true, 2020 год - високосный
        System.out.println(isLeapYear(1900)); // false, 1900 год - не високосный
        System.out.println(isLeapYear(2000)); // true, 2000 год - високосный
        System.out.println(isLeapYear(2021)); // false, 2021 год - не високосный
        System.out.println(isLeapYear(1600)); // true, 1600 год - високосный
    }
}