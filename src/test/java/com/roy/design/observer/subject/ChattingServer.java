package com.roy.design.observer.subject;

public class ChattingServer extends Server {
    public ChattingServer(String name) {
        super(name);
    }

    @Override
    public void useServer() {
        cpuUsage = cpuUsage + 10;
        memoryUsage = memoryUsage + 10;
        if (cpuUsage > 30 || memoryUsage > 50) {
            notify(cpuUsage, memoryUsage);
        }
    }

}
