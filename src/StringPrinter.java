public class StringPrinter {

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str); // Печатает строку в консоль
        }
    }

    public static void main(String[] args) {
        // Примеры использования метода
        printStringMultipleTimes("Hello, World!", 3); // Печатает строку 3 раза
        printStringMultipleTimes("Java is awesome!", 2); // Печатает строку 2 раза
        printStringMultipleTimes("Goodbye!", 1); // Печатает строку 1 раз
    }
}