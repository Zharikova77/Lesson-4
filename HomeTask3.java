package hometaskLesson4;

import java.rmi.UnexpectedException;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

/**
 * Написать программу, вычисляющую и отображающую все числа
 * Фибоначчи меньше введённого пользователем целого числа.
 *     Решить двумя способами: с помощью цикла и с помощью
 * рекурсии.
 */

public class HomeTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();

        getPreviousFibNum(num);

    }

    public static int getPreviousFibNum (int num) {
        int valueFib1 = 1;
        int valueFib2 = 1;
        int nextFibValue = 2;
        while (valueFib1 + valueFib2 < num) {
                nextFibValue = valueFib1 + valueFib2;
                valueFib1 = valueFib2;
                valueFib2 = nextFibValue;
            if (nextFibValue - valueFib2 >= num)
                break;
            System.out.println(nextFibValue);
            }
        return nextFibValue;
    }
}
