public class ColorExample {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = -1; // Вы можете изменить это значение на любое другое

        // Проверяем значение переменной value и выводим соответствующий цвет
        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Синий");
        }
    }
}

