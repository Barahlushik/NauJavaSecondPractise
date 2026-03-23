package org.example.cli;

import org.jline.reader.LineReader;

import java.util.List;

public class CliMenu {

    private final List<CliTask> tasks;

    public CliMenu(List<CliTask> tasks) {
        this.tasks = tasks;
    }

    public void start(LineReader reader) {

        while (true) {

            System.out.println();
            System.out.println("=== Практическая работа по Java #2 ===");

            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + " - " + tasks.get(i).name());
            }

            System.out.println("Вбейте z для выхода");

            String input = reader.readLine("Выберите пункт меню: ");

            if ("z".equals(input)) {
                System.out.println("Завершение программы... Покеда...");
                return;
            }

            try {

                int index = Integer.parseInt(input) - 1;

                if (index >= 0 && index < tasks.size()) {
                    tasks.get(index).run(reader);
                } else {
                    System.out.println("Неверный пункт меню");
                }

            } catch (NumberFormatException e) {
                System.out.println("Введите номер команды");
            }
        }
    }
}
