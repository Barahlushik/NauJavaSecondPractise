package org.example.cli.impl;

import org.example.cli.CliTask;
import org.example.second.SelectionSort;
import org.example.util.RandomSequenceGenerator;
import org.jline.reader.LineReader;

import java.util.List;

public class SecondTask  implements CliTask {
    @Override
    public String name() {
        return "Сортировка списка (Selection Sort)";
    }

    @Override
    public void run(LineReader reader) {

        try {
            int size = Integer.parseInt(reader.readLine("Введите размер списка: "));
            List<Double> list = RandomSequenceGenerator.generateDoubleList(size);
            System.out.println("Исходный список:\n" + list);
            new SelectionSort().sort(list);
            System.out.println("Отсортированный список:\n" + list);

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
