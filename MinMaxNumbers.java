import java.util.Random;

public class MinMaxNumbers {

    public static void main(String[] args) {
        Random random = new Random();

        // Переменные для хранения наименьшего и наибольшего чисел
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Генерация 20 случайных чисел
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(101) - 50; // От -50 до +50
            System.out.print(randomNumber + " "); // Печать числа

            // Обновление min и max
            if (randomNumber < min) {
                min = randomNumber;
            } else if (randomNumber > max) {
                max = randomNumber;
            }
        }

        // Вывод результатов
        System.out.println("\nНаименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);
    }
}
