public class ChecksumExample {
        public static void main(String[] args) {
            checksumSign();
        }

        public static void checksumSign() {
            int a = 5; // Вы можете изменить это значение на любое другое
            int b = -3; // Вы можете изменить это значение на любое другое

            int sum = a + b; // Суммируем переменные a и b

            // Проверяем, положительная ли сумма
            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }
    }

