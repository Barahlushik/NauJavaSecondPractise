package org.example.cli.impl;

import org.example.cli.CliTask;
import org.example.first.LastPositiveElementInArray;
import org.example.util.RandomSequenceGenerator;
import org.jline.reader.LineReader;

import java.util.Arrays;

public class FirstTask implements CliTask {

    @Override
    public String name() {
        return "Последний положительный элемент массива";
    }

    @Override
    public void run(LineReader reader) {
        try {
            int size = Integer.parseInt(reader.readLine("Введите размер массива: "));
            int[] array = RandomSequenceGenerator.generateIntArray(size);
            System.out.println("Полученный массив:\n " + Arrays.toString(array));
            LastPositiveElementInArray solver = new LastPositiveElementInArray();
            int result = solver.findLastPositiveInArray(array);
            System.out.println(result == -1 ? "Положительные элементы отсутствуют."
                    : "Последний положительный элемент: " + result);

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}