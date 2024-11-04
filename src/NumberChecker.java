public class NumberChecker {

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " является положительным.");
        } else {
            System.out.println("Число " + number + " является отрицательным.");
        }
    }

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-3);
        checkNumber(0);
        checkNumber(42);
        checkNumber(-1);
    }
}
