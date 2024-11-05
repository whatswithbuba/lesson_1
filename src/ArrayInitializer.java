import java.util.Arrays; // Импортируем класс Arrays

public class ArrayInitializer {

    public static void main(String[] args) {
        // Пример использования метода
        int len = 5; // Длина массива
        int initialValue = 10; // Начальное значение

        int[] array = createArray(len, initialValue);

        // Выводим созданный массив
        System.out.println("Созданный массив:");
        printArray(array);
    }

    // Метод для создания массива
    public static int[] createArray(int len, int initialValue) {
        // Создаем массив заданной длины
        int[] array = new int[len];

        // Заполняем массив значением initialValue с помощью Arrays.fill
        Arrays.fill(array, initialValue);

        return array; // Возвращаем заполненный массив
    }

    // Метод для вывода массива на консоль
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переход на новую строку
    }
}