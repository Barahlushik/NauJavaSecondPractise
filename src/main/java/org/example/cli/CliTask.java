package org.example.cli;

import org.jline.reader.LineReader;

public interface CliTask {
    String name();
    void run(LineReader reader);
}