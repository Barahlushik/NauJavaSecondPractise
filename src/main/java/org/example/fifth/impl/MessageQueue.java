package org.example.fifth.impl;

import org.example.fifth.Task;

import java.util.Queue;

public class MessageQueue implements Task {

    private final Queue<String> queue;
    private volatile boolean running = false;

    public MessageQueue(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void start() {
        running = true;
        System.out.println("Начинается обработка очереди сообщений...");

        while (running && !queue.isEmpty()) {
            String msg = queue.poll();
            System.out.println("Обработка: " + msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }

    @Override
    public void stop() {
        running = false;
        System.out.println("Shutdown обработки");
    }
}
