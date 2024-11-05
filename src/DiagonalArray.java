public class DiagonalArray {

    public static void main(String[] args) {
        int n = 5; // Размерность массива (количество строк и столбцов)
        int[][] array = new int[n][n]; // Создаем квадратный двумерный массив

        // Заполняем массив
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    array[i][j] = 1; // Заполняем диагональные элементы единицами
                } else {
                    array[i][j] = 0; // Остальные элементы заполняем нулями (по желанию)
                }
            }
        }

        // Выводим массив
        System.out.println("Квадратный массив с единицами на главной диагонали:");
        printArray(array);
    }

    // Метод для вывода двумерного массива на консоль
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // Переход на новую строку
        }
    }
}