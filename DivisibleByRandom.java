import java.util.Random;

public class DivisibleByRandom {

    public static void main(String[] args) {
        Random random = new Random();

        // Генерация 20 случайных чисел
        for (int i = 1; i <= 20; i++) {
            int randomNumber = random.nextInt(99) + 1; // От 1 до 99
            System.out.print(randomNumber + " ");
        }

        System.out.println("\n\nЧисла, делящиеся на первое число без остатка:");

        // Первое случайное число
        int firstRandomNumber = random.nextInt(99) + 1; // От 1 до 99
        System.out.println("Первое случайное число: " + firstRandomNumber);

        // Проверка делимости
        for (int i = 1; i <= 20; i++) {
            int randomNumber = random.nextInt(99) + 1; // От 1 до 99
            if (randomNumber % firstRandomNumber == 0) {
                System.out.print(randomNumber + " ");
            }
        }
    }
}

