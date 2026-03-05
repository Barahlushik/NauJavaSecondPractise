package org.example;

import org.example.cli.CliMenu;
import org.example.cli.CliTask;
import org.example.cli.impl.FirstTask;
import org.example.cli.impl.SecondTask;
import org.example.cli.impl.ThirdTask;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Terminal terminal = TerminalBuilder.builder()
                .system(true)
                .build();

        LineReader reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .build();

        List<CliTask> tasks = List.of(
                new FirstTask(),
                new SecondTask(),
                new ThirdTask()
        );

        CliMenu cli = new CliMenu(tasks);
        cli.start(reader);
    }
}