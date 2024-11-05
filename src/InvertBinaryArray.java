public class InvertBinaryArray {

    public static void main(String[] args) {
        // Создаем целочисленный массив, состоящий из 0 и 1
        int[] binaryArray = {0, 1, 1, 0, 0, 1, 1, 0};

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        printArray(binaryArray);

        // Заменяем 1 на 0 и 0 на 1
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 1) {
                binaryArray[i] = 0; // Заменяем 1 на 0
            } else {
                binaryArray[i] = 1; // Заменяем 0 на 1
            }
        }

        // Выводим измененный массив
        System.out.println("Измененный массив:");
        printArray(binaryArray);
    }

    // Метод для вывода массива на консоль
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переход на новую строку
    }
}