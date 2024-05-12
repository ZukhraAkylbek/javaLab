/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        // Заполнение массива случайными числами
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(100); // Генерация чисел от 0 до 99
        }

        // Вывод четных и нечетных значений
        System.out.println("\nЧетные значения:");
        for (int element : array) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }

        System.out.println("\nНечетные значения:");
        for (int element : array) {
            if (element % 2 != 0) {
                System.out.print(element + " ");
            }
        }
    }
}
