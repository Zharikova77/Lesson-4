package lesson5HomeTask;

import javax.sound.midi.MidiFileFormat;
import java.util.Arrays;

/**
 * Напишите программу, которая циклически сдвигает элементы
 * массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится
 * самым первым его элементом.
 */

public class HomeTask1 {

    public static void main(String[] args) {
        int[] numbers = {4, 89, 46, 9, 17, 109};

        System.out.println(Arrays.toString(numbers));
        changeNumOrder(numbers);
    }

    public static void changeNumOrder(int[] numbers) {
        int j = 0;
        for (int i = numbers.length - 1; j < numbers.length; i = j++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
