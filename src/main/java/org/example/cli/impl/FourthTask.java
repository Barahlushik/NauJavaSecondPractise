package org.example.cli.impl;

import org.example.cli.CliTask;
import org.example.fourth.ExampleService;
import org.jline.reader.LineReader;

public class FourthTask implements CliTask {

    private final ExampleService service = new ExampleService();

    @Override
    public String name() {
        return "HTTP клиент, получение Accept";
    }

    @Override
    public void run(LineReader reader) {
        System.out.println("Отправка запроса...");
        System.out.println("Значение Accept: " + service.fetchAcceptHeader());
    }
}
