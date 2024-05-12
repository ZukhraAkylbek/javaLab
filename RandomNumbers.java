/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();

        // Проверка введенного значения
        while (arraySize <= 0) {
            System.out.println("Размер массива должен быть больше 0.");
            System.out.print("Введите размер массива: ");
            arraySize = scanner.nextInt();
        }

        // Создание массива и генерация случайных чисел
        int[] numbers = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(90) + 10; // Двузначные числа от 10 до 99
        }

        // Вывод массива в две строки
        int halfSize = arraySize / 2;
        System.out.println("Первая половина массива:");
        for (int i = 0; i < halfSize; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nВторая половина массива:");
        for (int i = halfSize; i < arraySize; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}


