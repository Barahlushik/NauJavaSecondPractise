package org.example.cli.impl;

import org.example.cli.CliTask;
import org.example.fifth.Task;
import org.example.fifth.impl.MessageQueue;
import org.jline.reader.LineReader;

import java.util.LinkedList;
import java.util.List;

public class FifthTask implements CliTask {

    @Override
    public String name() {
        return "Обработка данных из очереди";
    }

    @Override
    public void run(LineReader reader) {
        Task t = new MessageQueue(new LinkedList<>(List.of("Санчез, как дела?",
        "Пойдет.",
        "Че кислый?",
        "Да пойдет я же сказал",
        "Куда пойдет?",
        "Не знаю, а куда бы ты пошел?")));

        t.start();

        // if *condition* => t.stop()
    }
}
