/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class SubtractFromX {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значения X
        System.out.print("Введите целое положительное число X: ");
        int x = scanner.nextInt();

        // Проверка X на положительность
        while (x <= 0) {
            System.out.println("X должно быть положительным числом.");
            System.out.print("Введите целое положительное число X: ");
            x = scanner.nextInt();
        }

        // Цикл вычитания чисел
        while (x > 0) {
            System.out.print("Введите число для вычитания из X: ");
            int toSubtract = scanner.nextInt();

            // Проверка числа на корректность
            while (toSubtract <= 0) {
                System.out.println("Число для вычитания должно быть больше 0.");
                System.out.print("Введите число для вычитания из X: ");
                toSubtract = scanner.nextInt();
            }

            // Вычитание
            x -= toSubtract;

            // Вывод текущего значения X
            System.out.println("X = " + x);
        }

        // Сообщение о завершении
        System.out.println("X стало равным 0 или отрицательному числу. Цикл вычитания завершен.");
    }
}


